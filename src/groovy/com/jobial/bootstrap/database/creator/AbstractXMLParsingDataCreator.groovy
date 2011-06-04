package com.jobial.bootstrap.database.creator

import com.jobial.bootstrap.database.creator.AbstractDataCreator
import groovy.util.slurpersupport.NodeChild

/**
 * Created by vincentgiguere 
 * 11-06-01 - 9:49 PM
 * Copyright © 2011 publicprivatecareer.com
 */
abstract class AbstractXMLParsingDataCreator extends AbstractDataCreator{


    abstract void execute(NodeChild slurp);
    abstract InputStream xmlStream();


    void execute() {

        execute(new XmlSlurper().parse(xmlStream()))

    }

}
