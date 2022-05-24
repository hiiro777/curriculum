<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%@ include file="header.jsp" %>
		<ul>
			<li id = "name">
				<label for = "name">name</label>
				<input type = "text" name = "name" value = "" size = "20">
			</li>
			<li id = "id">
				<label for = "id">id</label>
				<input type = "text" name = "id" value = "" size = "20">
			</li>
		</ul>
		<%@ include file="footer.jsp" %>
	</div>
</body>
</html>