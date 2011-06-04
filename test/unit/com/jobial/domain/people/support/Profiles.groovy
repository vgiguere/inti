package com.jobial.domain.people.support

import com.jobial.domain.people.serialization.ProfileProvider
import com.jobial.domain.people.Profile

/**
 * Created by vincentgiguere 
 * 11-05-30 - 3:05 PM
 * Copyright © 2011 publicprivatecareer.com
 */
class Profiles {

    static String serializedVincentGiguereGoogleProfile = "{\"googleUserId\":\"108274413175019789523\",\"name\":{\"givenName\":\"Vincent\",\"familyName\":\"Giguère\",\"formatted\":\"Vincent Giguère\"},\"verifiedEmail\":\"vincent.giguere@gmail.com\",\"displayName\":\"vincent.giguere\",\"preferredUsername\":\"vincent.giguere\",\"url\":\"https://www.google.com/profiles/108274413175019789523\",\"providerName\":\"Google\",\"identifier\":\"https://www.google.com/profiles/108274413175019789523\",\"email\":\"vincent.giguere@gmail.com\"}"

    Profile vincentGiguereGoogle = Profile.hydrate(serializedVincentGiguereGoogleProfile,ProfileProvider.JANRAIN );






}
