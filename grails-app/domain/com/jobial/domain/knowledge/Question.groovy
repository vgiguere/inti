package com.jobial.domain.knowledge

import com.jobial.domain.people.Member
import javax.persistence.Id

class Question {
    Member owner
    String title
    String text
    Integer vote = 0

    List<Answer> answers
    Answer closingAnswer

    static hasMany = [answers:Answer]


    static constraints = {
        closingAnswer nullable:true
        text maxSize: 25000
    }
}
