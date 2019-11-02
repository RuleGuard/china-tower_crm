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
		<form action="editUser" method="post">
			<label>用户名：</label><input type="text" name="name" value="${user.name}" readonly="readonly">
			<label>电话号码：</label><input type="text" name="tel" value="${user.tel}">
			<label>身份证号码：</label><input type="text" name="idcard" value="${user.idcard}">
			<label>所在店铺：</label><input type="text" name="store" value="${user.store}">
			<label>状态：</label><input type="text" name="state" value="${user.state}">
			<label>用户等级：</label><input type="text" name="ulevel" value="${user.ulevel}">
		</form>
	</div>
</body>
</html>