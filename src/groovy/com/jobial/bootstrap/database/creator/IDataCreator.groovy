package com.jobial.bootstrap.database.creator
import org.apache.commons.logging.Log;

/**
 * Created by vincentgiguere 
 * 11-05-31 - 4:23 PM
 * Copyright © 2011 publicprivatecareer.com
 */
public interface IDataCreator<Domain> {
    void execute()
    void printSummary()

}