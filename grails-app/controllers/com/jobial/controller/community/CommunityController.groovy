package com.jobial.controller.community

import com.jobial.domain.community.Community
import org.grails.plugins.google.visualization.data.Cell

class CommunityController {

    def index = { }

    def displayAvailable={

        def cells = []

        Community.findAll().each{community->
            cells.add(new Cell())
        }


    }
}
