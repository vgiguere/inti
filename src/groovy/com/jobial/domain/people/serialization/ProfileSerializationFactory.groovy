package com.jobial.domain.people.serialization

/**
 * Created by vincentgiguere 
 * 11-05-30 - 3:22 PM
 * Copyright © 2011 publicprivatecareer.com
 */
class ProfileSerializationFactory {



    static forProvider(com.jobial.domain.people.serialization.ProfileProvider provided){

        return new JanrainProfileSerialization();
    }

}
