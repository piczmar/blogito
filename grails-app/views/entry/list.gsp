
<%@ page import="blogito.Entry" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'entry.label', default: 'Entry')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
    	<g:if test="${session.user}">
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        </g:if>
        <div class="body">
	            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
	            <g:if test="${flash.message}">
	            <div class="message">${flash.message}</div>
	            </g:if>
			<div class="list">
				<g:each in="${entryInstanceList}" status="i" var="entryInstance">
					<g:render template="entry" bean="${entryInstance}" var="entryInstance" />
				</g:each>
			</div>

        </div>
        <div class="paginateButtons">
	        <g:paginate total="${entryInstanceTotal}" />
	    </div>
    </body>
</html>
