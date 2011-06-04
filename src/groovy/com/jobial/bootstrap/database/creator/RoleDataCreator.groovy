package com.jobial.bootstrap.database.creator

import org.apache.commons.logging.Log
import com.jobial.domain.security.Role
import org.springframework.stereotype.Component

/**
 * Created by vincentgiguere 
 * 11-05-31 - 11:10 PM
 * Copyright © 2011 publicprivatecareer.com
 */

@Component('roleDataCreator')
class RoleDataCreator extends AbstractDataCreator<Role>{
    void execute() {
        Role anonymous = new Role(authority:'ANONYMOUS').save()
        Role member = new Role(authority:'MEMBER').save()
        Role expert = new Role(authority:'EXPERT').save()
        Role blogger = new Role(authority:'BLOGGER').save()
        Role tagger = new Role(authority:'TAGGER').save()
        Role admin = new Role(authority:'ADMIN').save()
        Role sponsor = new Role(authority:'SPONSOR').save()
        Role superadmin = new Role(authority:'SUPERADMIN').save()
    }
}
