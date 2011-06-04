package com.jobial.bootstrap.database.creator

import com.jobial.domain.geo.GeographicLocation
import org.springframework.stereotype.Component

/**
 * Created by vincentgiguere 
 * 11-06-01 - 8:56 AM
 * Copyright © 2011 publicprivatecareer.com
 */
@Component
class GeographicLocationDataCreator extends AbstractDataCreator<GeographicLocation>{
    void execute() {
        GeographicLocation montreal = new GeographicLocation(name:'Montreal', latitude:45.30, longitude:73.40, region:'CA-QC').save();
        GeographicLocation toronto = new GeographicLocation(name:'toronto', latitude:43.42, longitude:79.80, region:'CA-ON').save();
        GeographicLocation newyork = new GeographicLocation(name:'newyork', latitude:40.30, longitude:71.51, region:'US-NY').save();
        GeographicLocation sanfrancisco = new GeographicLocation(name:'sanfrancisco', latitude:37.46, longitude:122.59, region:'CA-QC').save();
        GeographicLocation chicago = new GeographicLocation(name:'chicago', latitude:41.52, longitude:87.37, region:'CA-QC').save();
    }
}
