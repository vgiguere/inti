package com.jobial.domain.people


import javax.persistence.Id
import com.jobial.domain.people.serialization.ProfileProvider
import com.jobial.domain.people.serialization.ProfileSerializationFactory

class Profile {
    String providerName;

    @Id
    String providerAccountIdentifier;
    String address;
    Date birthday;
    String displayName;
    String familyName;
    String formattedName;
    String gender;
    String givenName;
    URL homepage;
    String preferredUsername;
    URL profilePhoto;
    TimeZone timezone;
    String email;


    static constraints = {
        address nullable:true
        gender nullable:true
        birthday nullable:true
        formattedName nullable:true
        homepage nullable:true
        profilePhoto nullable:true
        timezone nullable:true
    }

   static Profile hydrate(String serialized, ProfileProvider provider){
        return ProfileSerializationFactory.forProvider(provider).deserialize(serialized)
    }


    static Profile find


}
