package com.jobial.domain.security

import com.jobial.domain.people.Profile
import org.codehaus.groovy.grails.plugins.codecs.SHA256Codec

class User {

	String username
	String password
	boolean enabled=true
	boolean accountExpired=false
	boolean accountLocked=false
	boolean passwordExpired=false

	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		com.jobial.domain.security.UserRole.findAllByUser(this).collect { it.role } as Set
	}

    static User fromProfile(Profile profile){
        User user = new User()
        user.username = profile.email
        user.password = SHA256Codec.encode(profile.email)
        user.passwordExpired = true
        return user
    }
}
