
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>Room</title>
		<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/common.css'/>
		<script>
			function goCat(id) {
				location.href = '${pageContext.request.contextPath}/cat?catId='+id;
			}
		</script>
	</head>
	<body>

	<dev class="centralCard">
		<ul class="descriptionList">
			<li> <span>Data::</span> <em>May be some data</em> </li>
		</ul>

		<table class="table_grizzly">
			<tr>
				<th>ID</th>
				<th>Name</th>
			</tr>
			<c:forEach items="${cats}" var ="cat">
				<tr>
					<td onclick="goCat(${cat.getId()});">${cat.getId()}</td>
					<td onclick="goCat(${cat.getId()});">${cat.getName()}</td>
				</tr>
			</c:forEach>
		</table>

	</dev>
	</body>
</html>
