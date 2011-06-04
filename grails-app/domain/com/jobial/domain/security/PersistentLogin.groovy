package com.jobial.domain.security

import com.jobial.domain.people.Member

class PersistentLogin {

	String id
	String username
	String token
	Date lastUsed
    Member member

	static constraints = {
		username maxSize: 64
		token maxSize: 64
		id maxSize: 64
	}
	
	static transients = ['series']

	void setSeries(String series) { id = series }
	String getSeries() { id }

	static mapping = {
		table 'persistent_logins'
		id column: 'series', generator: 'assigned'
		version false
	}
}
