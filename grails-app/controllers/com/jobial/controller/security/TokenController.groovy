package com.jobial.controller.security

import com.jobial.domain.people.serialization.ProfileProvider

import com.jobial.domain.people.Member
import com.jobial.domain.people.Profile
import grails.plugins.springsecurity.SpringSecurityService
import com.jobial.domain.community.Community

class TokenController {

    def engageService
    def loginService


    def processCallback = {
        if (params.token) {
            // Retrieve Janrain token
            def token = params.token
            
            // Retrieve Janrain authentication info
            def response = engageService.authInfo(token)
            
            // Retrieve plain JSON response
            // See Janrain4j apidocs (http://janrain4j.googlecode.com/svn/docs/1.0.x/apidocs/index.html) for detailed information of data returned by EngageService.authInfo(string token) method
            def json = response.responseAsJSONObject

            Community community = Community.findByIdentifier("javamtl")

            loginService.authenticateUser(Profile.hydrate(json.profile.toString(), com.jobial.domain.people.serialization.ProfileProvider.JANRAIN), community)

            return forward (controller:'login')

        }
        else {
            redirect(uri: "/index.gsp")
        }
    }
}
