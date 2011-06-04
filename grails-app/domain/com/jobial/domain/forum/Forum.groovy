package com.jobial.domain.forum

class Forum {

    Date dateCreated
    Date lastUpdated
    String name
    String description
    List<Topic> topics

    static hasMany = [topics:Topic]


    static constraints = {
    }
}
