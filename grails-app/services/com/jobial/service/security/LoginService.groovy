package com.jobial.service.security

//import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils


import com.jobial.domain.people.Profile
import com.jobial.domain.security.User
import com.jobial.domain.community.Community
import com.jobial.domain.people.Member
import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils
import grails.plugins.springsecurity.SpringSecurityService
import org.springframework.security.core.context.SecurityContext
import org.springframework.security.authentication.AuthenticationManager
import com.jobial.framework.security.IntiAuthentication

class LoginService {

    static transactional = true
    AuthenticationManager authenticationManager

    def serviceMethod() {

    }

    public void reauthenticate(User user) {
        //SpringSecurityUtils.reauthenticate(user.getUsername(), null);
    }

    public void authenticateUser(User user, Community community) {
        Member member = createMemberIfRequired(user, community)

        authenticationManager.authenticate(new IntiAuthentication(member))

    }

    Member createMemberIfRequired(User user, Community community) {
        Member member = Member.findByUserAndCommunity(user, community)

        if(!member){
            member = new Member(community:community, user:user)
            member.save()
        }
        return member
    }


    public void authenticateUser(Profile requestedProfile, Community community) {
        Profile profile = createProfileIfRequired(requestedProfile)
        User user = createUserIfRequired(profile)
        authenticateUser(user, community)
    }

    protected User createUserIfRequired(Profile profile) {

        User user = User.findByUsername(profile.email)
        if(!user){
            user = User.fromProfile(profile).save()
        }
        return user

    }

    protected Profile createProfileIfRequired(Profile requestedProfile) {
        Profile profile = Profile.findByProviderAccountIdentifier(requestedProfile.providerAccountIdentifier)
        if (!profile) {
            profile = requestedProfile.save()
        }
        return profile
    }
}
