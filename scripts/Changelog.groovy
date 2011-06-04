includeTargets << grailsScript("Init")
includeTargets << grailsScript("_GrailsBootstrap")
includeTargets << grailsScript("_GrailsEvents")
includeTargets << new File("${basedir}/scripts/RestoreDatabase.groovy")

target(main: "Run the changelogs") {
  depends(restore_database, configureProxy, packageApp, classpath)
  Class databaseMigrationClass = classLoader.loadClass('com.jobial.bootstrap.database.DatabaseMigration') as Class
  def databaseMigration = databaseMigrationClass.newInstance()
  databaseMigration.migrate()
}

setDefaultTarget(main)
