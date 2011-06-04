package com.jobial.domain.forum

import com.jobial.domain.people.Member

class Post {

   Date dateCreated
   Date lastUpdated
   String content
   Member postedBy

   static belongsTo = [topic:Topic]


    static constraints = {
    }
}
