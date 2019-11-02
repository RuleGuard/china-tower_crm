<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>添加用户</title>
<script src="Scripts/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
//	$("#idcard").bind("focus",function(){
//		alert("idcard");
//	}); 
</script>
</head>
<body>
	<div id="add"> 
		<form action="addUs" method="post" >
			<label>用户名：</label><input type="text" name="name"><br><br>
			<label>密码：</label><input type="password" name="pwd">
			<br><br><label>电话号码：</label><input type="text" name="tel">
			<br><br><label>身份证号码：</label><input type="text" name="idcard" id="id1">
			<br><br><label>所属店铺：</label><input type="text" name="store">
			<br><br><label>用户身份：</label><input type="text" name="ulevel">
			<br><br><input type="submit" value="添 加">
		</form>
	</div>
</body>
</html>