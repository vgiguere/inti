<%@ page import="com.jobial.domain.knowledge.Question" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="${message(code: 'question.label', default: 'Question')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<div class="nav">
    <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a>
    </span>
    <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label"
                                                                               args="[entityName]"/></g:link></span>
</div>

<div class="body">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message">${flash.message}</div>
    </g:if>
    <div class="list">
        <div id="questions">
            <g:each in="${questionInstanceList}" status="i" var="question">
                <div class="questionItem">
                    <h1><a href="<g:createLink controller="knowledge" action="show" id="${question.id}"/>">${question.title.encodeAsHTML()}</a></h1>
                    <div class="questionPreview">
                        <pre><inti:chunk>
                            ${question.text}
                        </inti:chunk></pre>
                    </div>
                </div>
            </g:each>
        </div>
    </div>
    <div class="paginateButtons">
        <g:paginate total="${questionInstanceTotal}"/>
    </div>
</div>
</body>
</html>
