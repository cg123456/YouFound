<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
</head>
<body>
<div style="text-align:center;">
	<form action="user.do?method=reg" method="post">
		&nbsp;用户名：<input type="text" name="username"><br><br>
		&nbsp;&nbsp;密码：<input type="password" name="password"><br><br>
		确认密码：<input type="password" name="password2"><br><br>
		&nbsp;&nbsp;邮箱：<input type="text" name="email"><br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交"><br>
	</form>
</div>

</body>
</html>