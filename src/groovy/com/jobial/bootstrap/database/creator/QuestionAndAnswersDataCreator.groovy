package com.jobial.bootstrap.database.creator

import org.springframework.stereotype.Component
import com.jobial.domain.knowledge.Question
import com.jobial.domain.people.Member
import com.jobial.domain.security.User
import com.jobial.domain.community.Community
import groovy.util.slurpersupport.NodeChild
import com.jobial.domain.knowledge.Answer

/**
 * Created by vincentgiguere 
 * 11-06-01 - 9:21 PM
 * Copyright © 2011 publicprivatecareer.com
 */
@Component
class QuestionAndAnswersDataCreator extends AbstractXMLParsingDataCreator{


    void execute(NodeChild slurper) {
        Member latestMember = createAuthor('Emmingway')

        slurper.entry.each{entry->
            Question question = new Question(title: entry.title.text(), text: entry.summary.text(), owner: createAuthor(entry.author.name.text())).save()
            entry.answer.each{answer->
                question.addToAnswers(new Answer(text:answer.text(), owner:latestMember).save())
            }
            latestMember = question.owner
        }
    }

    Member createAuthor(String name) {
        Community community = Community.findByIdentifier("javamtl")
        User user = User.findByUsername(name)
        if(!user){
            user = new User(username:name, password:'11263gdfg34y8wi').save()
        }
        return new Member(user:user, community:community).save()
    }

    @Override
    InputStream xmlStream() {
        return  QuestionAndAnswersDataCreator.class.classLoader.getResourceAsStream("com/jobial/bootstrap/database/creator/xml/knowledge/GrailsQAndAFeed.xml")
    }
}
