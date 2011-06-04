package com.jobial.framework.security

import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority
import com.jobial.domain.people.Member
import com.jobial.domain.security.UserRole
import org.springframework.security.core.authority.GrantedAuthorityImpl
import com.jobial.domain.security.User
import org.codehaus.groovy.grails.plugins.codecs.SHA256Codec

/**
 * Created by vincentgiguere 
 * 11-06-01 - 4:16 PM
 * Copyright © 2011 publicprivatecareer.com
 */
class IntiAuthentication implements Authentication {
    Member member;
    User user;
    Collection<GrantedAuthority>  authorities

    public IntiAuthentication(Member member){
        user = member.user
        authorities = new ArrayList<GrantedAuthority>()
        UserRole.findAllByUser(member.user).each{userRole->
          authorities.add(new GrantedAuthorityImpl(userRole.role.authority))
        }
    }

    Collection<GrantedAuthority> getAuthorities() {
        return authorities
    }

    Object getCredentials() {
        return SHA256Codec.decode(user.password)
    }
    Object getDetails() {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }

    Object getPrincipal() {
        return user.username
    }

    boolean isAuthenticated() {
        return true
    }

    void setAuthenticated(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
    String getName() {
        return user.username
    }
}
