<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>所有用户</title>
</head>
<body>
	<div id="tables">
		<table>
			<tr>
				<th>用户名</th>
				<th>电话号码</th>
				<th>身份证号码</th>
				<th>所在店铺</th>
				<th>是否在职</th>
				<th>用户等级</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.name }</td>
					<td>${list.tel }</td>
					<td>${list.idcard }</td>
					<td>${list.store }</td>
					<td> 
						<c:if test="${list.state==0 }">在职</c:if>
						<c:if test="${list.state==1 }">休假</c:if>
						<c:if test="${list.state==2 }">离职</c:if>
					</td>
					<td>
						<c:if test="${list.ulevel==0 }">业务员</c:if>
						<c:if test="${list.ulevel==1 }">店长</c:if>
						<c:if test="${list.ulevel==2 }">区域经理</c:if>
						<c:if test="${list.ulevel==3 }">管理员</c:if>
					</td>
					<td><a href="editUser/${list.id }">编辑</a></td>
				</tr>
			</c:forEach> 
		</table>	
	</div>
</body>
</html>