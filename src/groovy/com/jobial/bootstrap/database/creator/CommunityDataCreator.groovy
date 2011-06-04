package com.jobial.bootstrap.database.creator

import com.jobial.domain.community.Community
import com.jobial.domain.geo.GeographicLocation
import org.springframework.stereotype.Component

/**
 * Created by vincentgiguere 
 * 11-06-01 - 8:55 AM
 * Copyright © 2011 publicprivatecareer.com
 */
@Component
class CommunityDataCreator extends AbstractDataCreator<Community>{
    void execute() {

        GeographicLocation montreal = GeographicLocation.findByName('Montreal')
        GeographicLocation nyc = GeographicLocation.findByName('newyork')

        Community montrealJavaCommunity = new Community(name:'Montreal Java Community', identifier: 'javamtl', geoLocation: montreal).save()
        Community montrealDentistryCommunity = new Community(name:'Montreal Dentistry Community', identifier: 'toothmtl', geoLocation: montreal).save()
        Community financeNYC = new Community(name:'New York Financial Community', identifier: 'financeNYC', geoLocation: nyc).save()
    }


}
