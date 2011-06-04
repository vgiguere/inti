package com.jobial.bootstrap.database.creator

import org.springframework.stereotype.Component
import com.jobial.domain.security.User
import com.jobial.domain.security.UserRole
import com.jobial.domain.security.Role
import org.codehaus.groovy.grails.plugins.codecs.SHA256Codec

/**
 * Created by vincentgiguere 
 * 11-05-31 - 11:09 PM
 * Copyright © 2011 publicprivatecareer.com
 */

@Component
class UserDataCreator extends AbstractDataCreator<User>{
    void execute() {

        Role anonymousRole = Role.findByAuthority('ANONYMOUS')
        Role memberRole = Role.findByAuthority('MEMBER')
        Role expertRole = Role.findByAuthority('EXPERT')
        Role bloggerRole = Role.findByAuthority('BLOGGER')
        Role taggerRole = Role.findByAuthority('TAGGER')
        Role adminRole = Role.findByAuthority('ADMIN')
        Role sponsorRole = Role.findByAuthority('SPONSOR')
        Role superadminRole = Role.findByAuthority('SUPERADMIN')

        User admin = new User(username:'admin', password:SHA256Codec.encode('admin')).save()
        new UserRole(user:admin, role:superadminRole).save()
        new UserRole(user:admin, role:adminRole).save()

        User member = new User(username:'member', password:SHA256Codec.encode('member')).save()
        new UserRole(user:member, role:memberRole).save()

        User anonymous =  new User(username:'anonymous', password:SHA256Codec.encode('anonymous')).save()
        new UserRole(user:anonymous, role:anonymousRole).save()

        User expert =  new User(username:'expert', password:SHA256Codec.encode('expert')).save()
        new UserRole(user:expert, role:expertRole).save()

        User blogger =  new User(username:'blogger', password:SHA256Codec.encode('blogger')).save()
        new UserRole(user:blogger, role:bloggerRole).save()

        User tagger =  new User(username:'tagger', password:SHA256Codec.encode('tagger')).save()
        new UserRole(user:tagger, role:taggerRole).save()

        User sponsor =  new User(username:'sponsor', password:SHA256Codec.encode('sponsor')).save()
        new UserRole(user:sponsor, role:sponsorRole).save()
    }
}
