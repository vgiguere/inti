import java.sql.SQLException
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.sql.Connection
import org.codehaus.groovy.grails.commons.ConfigurationHolder
import grails.util.GrailsUtil
import org.codehaus.groovy.grails.commons.ApplicationHolder
import org.codehaus.groovy.grails.commons.GrailsApplication

target(restore_database: "This script restores the database. It is meant to be used prior to testing liquibase changelogs") {

  println "RESTORING DATABASE"

  def command = 'mysql "-uposeidon" "-pposeidon" "--execute=DROP SCHEMA POSEIDON; CREATE SCHEMA POSEIDON; USE POSEIDON; \\. grails-app/conf/database/restore/poseidon_restore.sql'
  def proc = command.execute()
  proc.waitFor()

  println "Database restored returned code: ${ proc.exitValue()}"
  println "Errors: ${proc.err.text}"
  println "Messages: ${proc.in.text}"

  println "RESTORE COMPLETE"
}

setDefaultTarget(restore_database)
