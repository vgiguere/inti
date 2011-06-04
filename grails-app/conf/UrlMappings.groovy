class UrlMappings {

	static mappings = {

        "/home/$communityIdentifier"(controller:'home', action:'index', params:[communityIdentifier:$communityIdentifier])

        "/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}


		"/"(view:"/index")
		"500"(view:'/error')
	}
}
