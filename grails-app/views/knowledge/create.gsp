

<%@ page import="com.jobial.domain.knowledge.Question" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'question.label', default: 'Question')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${questionInstance}">
            <div class="errors">
                <g:renderErrors bean="${questionInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="closingAnswer"><g:message code="question.closingAnswer.label" default="Closing Answer" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: questionInstance, field: 'closingAnswer', 'errors')}">
                                    <g:select name="closingAnswer.id" from="${com.jobial.domain.knowledge.Answer.list()}" optionKey="id" value="${questionInstance?.closingAnswer?.id}" noSelection="['null': '']" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="text"><g:message code="question.text.label" default="Text" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: questionInstance, field: 'text', 'errors')}">
                                    <g:textArea name="text" cols="40" rows="5" value="${questionInstance?.text}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="owner"><g:message code="question.owner.label" default="Owner" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: questionInstance, field: 'owner', 'errors')}">
                                    <g:select name="owner.id" from="${com.jobial.domain.people.Member.list()}" optionKey="id" value="${questionInstance?.owner?.id}"  />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="title"><g:message code="question.title.label" default="Title" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: questionInstance, field: 'title', 'errors')}">
                                    <g:textField name="title" value="${questionInstance?.title}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="vote"><g:message code="question.vote.label" default="Vote" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: questionInstance, field: 'vote', 'errors')}">
                                    <g:textField name="vote" value="${fieldValue(bean: questionInstance, field: 'vote')}" />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
