package com.jobial.domain.people.serialization

import com.jobial.domain.people.Profile

/**
 * Created by vincentgiguere 
 * 11-05-30 - 3:17 PM
 * Copyright © 2011 publicprivatecareer.com
 */
public interface IProfileSerialization {

     public Profile deserialize(String serialized, ProfileProvider provided);
}