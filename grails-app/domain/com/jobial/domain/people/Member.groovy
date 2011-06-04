package com.jobial.domain.people

import com.jobial.domain.security.User
import com.jobial.domain.community.Community

class Member {
    Community community

    static constraints = {
    }

    static belongsTo = [user:User]
}
