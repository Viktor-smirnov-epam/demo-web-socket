
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Cat</title>
        <link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/common.css'/>
    </head>
    <body>
        <dev class="centralCard">
            <ul class="descriptionList">
                <li> <span>Id:</span> <em>${cat.getId()}</em> </li>
                <li> <span>Name:</span> <em>${cat.getName()}</em> </li>
            </ul>
        </dev>
    </body>
</html>
