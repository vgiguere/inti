<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <title><g:layoutTitle default="Grails"/></title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'base.css')}"/>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'reset-fonts-grids.css')}"/>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'menu.css')}"/>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
    <g:javascript library="jquery" plugin="jquery"/>
    <g:javascript library="application"/>
    <g:setProvider library="jquery"/>
    <g:layoutHead/>
</head>

<body>
<div id="doc3" class="yui-t2">
    <div id="hd">
        <img src="http://www.blog.spoongraphics.co.uk/wp-content/uploads/2011/abstract-radial/header.jpg"/>
        <img src="http://www.blog.spoongraphics.co.uk/wp-content/uploads/2011/abstract-radial/header.jpg"/>
        <img src="http://www.blog.spoongraphics.co.uk/wp-content/uploads/2011/abstract-radial/header.jpg"/>
    </div>

    <div id="bd">
        <div id="yui-main">
            <div class="yui-b" id="content">
                <g:layoutBody/>
            </div>
        </div>

        <div id="left_menu" class="yui-b">
            <div class="arrowlistmenu">

            <h3 class="headerbar">Public</h3>
            <ul>
            <li><a href="<g:createLink controller="knowledge" action="list"/>">Question and Answers</a></li>
            <li><a href="http://www.dynamicdrive.com/style/csslibrary/category/C2/">Blogs</a></li>
            <li><a href="http://www.dynamicdrive.com/style/csslibrary/category/C4/">Forums</a></li>
            <li><a href="http://www.dynamicdrive.com/style/csslibrary/category/C6/">Trainings</a></li>
            <li><a href="http://www.dynamicdrive.com/style/csslibrary/category/C5/">Invite Friends</a></li>
            <li><a href="http://www.dynamicdrive.com/style/csslibrary/category/C7/">Events</a></li>
            <li><a href="http://www.dynamicdrive.com/style/csslibrary/category/C8/">Other</a></li>
            </ul>

            <h3 class="headerbar">Private</h3>
            <ul>
            <li><a href="http://www.cssdrive.com/index.php/menudesigns/">My Profile</a></li>
            <li><a href="http://www.cssdrive.com/index.php/examples/">My Job Searches</a></li>
            <li><a href="http://www.cssdrive.com/index.php/main/csscompressor/">Interested Employers</a></li>
            <li><a href="http://www.dynamicdrive.com/forums/forumdisplay.php?f=6">Rules of Engagement</a></li>
            </ul>

            </div>


        </div>
    </div>

    <div id="ft">
        <pre>Proudly developed in Montreal - WARNING! May contain traces of Epiphany, chrysotile asbestos and pium-pium sweat...</pre>
    </div>
</div>
</body>
</html>





