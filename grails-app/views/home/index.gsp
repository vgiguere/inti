<%@ taglib prefix="janrain" uri="http://janrain4j.googlecode.com/tags" %>
<html>
    <head>
        <title>Welcome to You Community Page</title>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div id="nav">
            <div class="homePagePanel">
                <div class="panelTop"></div>
                <div class="panelBody">
                    <ul>
                        <li>Tabarnak</li>
                    </ul>

                </div>
                <div class="panelBtm"></div>
            </div>
        </div>
        <div id="pageBody">
            <h1><sec:loggedInUserInfo field="username"/>, Welcome to your Community Page</h1>
            <p>Congratulations, you have successfully logged into your community homepage.</p>
        </div>
    </body>
</html>
