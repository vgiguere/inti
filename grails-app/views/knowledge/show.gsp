<%@ page import="com.jobial.domain.knowledge.Question" %>
<html>
<head>

    <!-- Skin CSS file -->
    <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/2.9.0/build/assets/skins/sam/skin.css">
    <!-- Utility Dependencies -->
    <script src="http://yui.yahooapis.com/2.9.0/build/yahoo-dom-event/yahoo-dom-event.js"></script>
    <script src="http://yui.yahooapis.com/2.9.0/build/element/element-min.js"></script>
    <!-- Needed for Menus, Buttons and Overlays used in the Toolbar -->
    <script src="http://yui.yahooapis.com/2.9.0/build/container/container_core-min.js"></script>
    <!-- Source file for Rich Text Editor-->
    <script src="http://yui.yahooapis.com/2.9.0/build/editor/simpleeditor-min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="${message(code: 'question.label', default: 'Question')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
    <jq:jquery>

        var myEditor = new YAHOO.widget.SimpleEditor('answer', {
            height: '300px',
            width: '522px',
            dompath: true //Turns on the bar at the bottom
        });
        myEditor.render();


        $('a[name=submitAnswer]').click(function(e){
            e.preventDefault()
             myEditor.saveHTML()

        $('form#giveAnswer').submit()
    })

    </jq:jquery>

    <style type="text/css">

    .question .title {
        display: inline;
        font-size: 1.6em;
        line-height: 1.2em;
        letter-spacing: -1px;
        margin-bottom: 0;
        margin: 0 0 10px;
        display: block;
    }

    .question {
        margin-top: 3px;
        width: 485px;
        margin-left: 20px;
        margin-bottom: 40px;
        border-bottom: 1px green solid;

    }

    .answers {
        margin-left: 20px;
    }

     .add_answer{
         margin-left :20px;
     }

    .answer {
        margin-top: 3px;
        width: 485px;
        margin-left: 20px;
        margin-bottom: 40px;
        border-bottom: 1px green solid;

    }

    .question .text {
        font-size: 1.2em;
        font: 13px/1.231 arial, helvetica, clean, sans-serif;
        font-family: "Helvetica Neue", Helvetica, Arial, default;
    }

    ol {
        margin-top: 10px;
        margin-bottom: 10px;
        margin-left: 20px;
    }
    </style>

</head>


<body>

This is some nice shit that should be about 180 pixels to the right of the screen.

</body>


<body>

<div class="body">
    <div class="question">
        <div class="title">${question.title}</div>

        <div class="text">${question.text}</div>
    </div>

    <g:if test="${question.answers}">
        <div class="answers">
            <h1>Answers</h1>

            <g:each in="${question.answers}" var="answer">
                <div class="answer">
                    <div class="title">
                        ${answer.owner.user.username}
                    </div>
                    ${answer.text}
                </div>
            </g:each>
        </div>
    </g:if>

    <div class="yui-skin-sam add_answer">
        <strong>Add Answer</strong>

        <g:form name="giveAnswer" action="giveAnswer">
            <g:hiddenField name="questionId" value="${question.id}"/>
            <textarea name="answer" id="answer" cols="50" rows="10">
                Type in your answer and click submit when you are done.
            </textarea>
        </g:form>
    </div>



    <a name="submitAnswer"
       href="<g:createLink controller="knowledge" action="giveAnswer" id="${question.id}"/>">Submit my answer!</a>
</div>

</body>

</html>
