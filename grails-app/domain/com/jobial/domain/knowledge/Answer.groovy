package com.jobial.domain.knowledge

import com.jobial.domain.people.Member

class Answer {
    Member owner
    String text
    Integer vote = 0

    static constraints = {
        text maxSize: 4096
    }
}
