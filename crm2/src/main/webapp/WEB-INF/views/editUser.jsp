<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="editUs" method="post">
			<label>用户名：</label><input type="text" name="name" value="${user.name}" readonly="readonly">
			<br><br><label>电话号码：</label><input type="text" name="tel" value="${user.tel}">
			<br><br><label>身份证号码：</label><input type="text" name="idcard" value="${user.idcard}">
			<br><br><label>所在店铺：</label><input type="text" name="store" value="${user.store}">
			<br><br><label>状态：</label><input type="text" name="state" value="${user.state}">
			<br><br><label>用户等级：</label><input type="text" name="ulevel" value="${user.ulevel}">
			<br><br><input type="submit" value="修  改">
		</form>
	</div>
</body>
</html>