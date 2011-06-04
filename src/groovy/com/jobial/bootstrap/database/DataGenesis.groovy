package com.jobial.bootstrap.database

import org.springframework.stereotype.Component

import groovy.time.TimeDuration
import groovy.time.TimeCategory
import org.hibernate.Session
import org.hibernate.Transaction
import com.jobial.bootstrap.database.creator.IDataCreator
import org.springframework.beans.factory.annotation.Autowired
import com.jobial.bootstrap.database.creator.GeographicLocationDataCreator

/**
 * Created by vincentgiguere 
 * 11-05-31 - 4:01 PM
 * Copyright © 2011 publicprivatecareer.com
 */

@Component('datagenesis')
class DataGenesis {

    @Autowired
    def roleDataCreator
    @Autowired
    def userDataCreator
    @Autowired
    def geographicLocationDataCreator
    @Autowired
    def communityDataCreator
    @Autowired
    def questionAndAnswersDataCreator

    public void createTheWorld(Session session){

        List<IDataCreator> creators = [geographicLocationDataCreator, communityDataCreator,  roleDataCreator, userDataCreator,questionAndAnswersDataCreator]

        Date startTime = new Date()
        println("################## BEGINNING DATA GENESIS AT : ${startTime.getTimeString()}")
        creators.each{creator->
            Transaction transaction = session.beginTransaction()
            println("################## DATA CREATOR ${creator.class.getSimpleName()} HAS BEGUN")
            try{
                creator.execute()
                transaction.commit()
            }catch(Exception e){
                e.printStackTrace()
                transaction.rollback()
            }finally{
                session.clear()
            }
            println("################## DATA CREATOR ${creator.class.getSimpleName()} HAS FINISHED")
            creator.printSummary()
        }
        Date endTime = new Date()
        println("################## ENDING DATA GENESIS AT : ${endTime.getTimeString()}")
        TimeDuration duration = TimeCategory.minus(endTime, startTime)
        println("################## ELAPSED TIME:  ${duration.toString()}")
        println("################## DATA GENESIS COMPETED")
    }
}
