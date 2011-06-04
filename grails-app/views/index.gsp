<%@ page import="org.grails.plugins.google.visualization.data.Cell" %>

<html>
    <head>
        <title>Welcome to Grails</title>
        <meta name="layout" content="main" />
        <script type="text/javascript" src="http://www.google.com/jsapi"></script>
    </head>
    <body>
        <div id="nav">
            <div class="homePagePanel">
                <div class="panelTop"></div>
                <div class="panelBody">
                    <h1>Application Status</h1>
                    <ul>
                        <li>App version: <g:meta name="app.version"></g:meta></li>
                        <li>Grails version: <g:meta name="app.grails.version"></g:meta></li>
                        <li>Groovy version: ${org.codehaus.groovy.runtime.InvokerHelper.getVersion()}</li>
                        <li>JVM version: ${System.getProperty('java.version')}</li>
                        <li>Controllers: ${grailsApplication.controllerClasses.size()}</li>
                        <li>Domains: ${grailsApplication.domainClasses.size()}</li>
                        <li>Services: ${grailsApplication.serviceClasses.size()}</li>
                        <li>Tag Libraries: ${grailsApplication.tagLibClasses.size()}</li>
                    </ul>
                    <h1>Installed Plugins</h1>
                    <ul>
                        <g:set var="pluginManager" value="${applicationContext.getBean('pluginManager')}"></g:set>
                        <g:each var="plugin" in="${pluginManager.allPlugins}">
                            <li>${plugin.name} - ${plugin.version}</li>
                        </g:each>
                    </ul>
                </div>
                <div class="panelBtm"></div>
            </div>
        </div>
        <div id="pageBody">
            <h1>Welcome to public private career</h1>
            <p>Public Private Career is a constellation of professional communities all around the world!</p>
            <div id="communityLocator">
                Use the map below to locate the professional community that matches your profile!


                <%
                   def communityColumns = [['number', 'Lat'], ['number','Lon'],['string', 'Name'], ]
                    def communityData = [['43.123', '70.123', 'Montreal'], ['40.123', '80.123', 'Toronto'],['45.123', '134.123', 'Vancouver']]
                    %>
                <gvisualization:map elementId="communityMap" columns="${communityColumns}" data="${communityData}"/>
            </div>


        </div>
    </body>
</html>
