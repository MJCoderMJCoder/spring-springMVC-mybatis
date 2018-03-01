<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我就不插入标题</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/controller/sysConfigs"
		method="post">
		昵称：<input type="text" name="nickname" value="${nickname }"><br>
		密码：<input type="password" name="password" value="${password }"><br>
		<input type="submit" value="登录"><br>
		<p style="color: red;">${errorMsg }</p>
	</form>
</body>
</html>