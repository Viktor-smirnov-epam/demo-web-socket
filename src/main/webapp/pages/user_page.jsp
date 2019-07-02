
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>UserPage</title>
        <link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/common.css'/>
    </head>
    <body>
    <dev class="centralCard">
        <ul class="descriptionList">
            <li> Name: ${user.getName()} </li>
        </ul>
    </dev>
    </body>
</html>
