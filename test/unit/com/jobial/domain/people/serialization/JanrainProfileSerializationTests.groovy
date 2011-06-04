package com.jobial.domain.people.serialization

import com.jobial.framework.test.UnitTest
import com.jobial.domain.people.support.Profiles

import com.jobial.domain.people.Profile

/**
 * Created by vincentgiguere 
 * 11-05-30 - 5:41 PM
 * Copyright © 2011 publicprivatecareer.com
 */
class JanrainProfileSerializationTests extends com.jobial.framework.test.UnitTest {


    JanrainProfileSerialization serialization

    @Override
    protected void setUp() {
        super.setUp()

        serialization = new JanrainProfileSerialization()
    }


    public void testJanrainProfileDeserializationFillsInAllProfileFields(){

        Profile profile = serialization.deserialize(com.jobial.domain.people.support.Profiles.serializedVincentGiguereGoogleProfile)

        assertEquals "Google", profile.providerName
        assertEquals "https://www.google.com/profiles/108274413175019789523", profile.providerAccountIdentifier
        assertEquals "vincent.giguere", profile.displayName
        assertEquals "Giguère", profile.familyName
        assertEquals "Vincent", profile.givenName
        assertEquals "vincent.giguere", profile.preferredUsername
        assertEquals "vincent.giguere@gmail.com", profile.email
        assertEquals "Vincent Giguère", profile.formattedName
        assertNull profile.address
        assertNull profile.birthday
        assertNull profile.gender
        assertNull profile.homepage
        assertNull profile.profilePhoto
        assertNull profile.timezone
    }
}
