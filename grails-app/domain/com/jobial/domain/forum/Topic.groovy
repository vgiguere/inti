package com.jobial.domain.forum

class Topic {

    Date dateCreated
    Date lastUpdated

    String subject
    Integer views = 0
    List<Post> posts

    static belongsTo = [forum:Forum]
    static hasMany = [posts:Post]

    static constraints = {
    }
}
