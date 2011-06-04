package com.jobial.domain.people.serialization

//import groovy.json.JsonSlurper


import com.jobial.domain.people.Profile
import grails.converters.JSON

/**
 * Created by vincentgiguere 
 * 11-05-30 - 3:23 PM
 * Copyright © 2011 publicprivatecareer.com
 */
class JanrainProfileSerialization {

    public Profile deserialize(String janrainProfile) {


        def json = JSON.parse(janrainProfile)


        Profile profile = new Profile();
        profile.providerName = json.providerName
        profile.providerAccountIdentifier = json.identifier
        profile.familyName = json.name?.familyName
        profile.formattedName = json.name?.formatted
        profile.givenName = json.name?.givenName
        profile.displayName = json.displayName
        profile.preferredUsername = json.preferredUsername
        try {
            profile.profilePhoto = new URL(json.profilePhoto);
            profile.homepage = new URL(json.homepage);
        } catch (MalformedURLException e) {
            //shut up.. just keep on going. home page and pictures will not be available.
        }

        //Theimezone is not present on Google parsers
        profile.gender = json.gender
        profile.email = json.email

        return profile

    }

}
