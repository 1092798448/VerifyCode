<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<script type="text/javascript">
function _change() {
	var img = document.getElementById("change");
	img.src="<%=request.getContextPath()%>/verify.do?method=verify&a=" + new Date().getTime();
	return;
}
</script>
</head>
<body>
<font color="red">${errMsg }</font>
<form action="<%=request.getContextPath()%>/login.do" method="post">
用户名： <input type="text" name="username"/> <br/>
密码： <input type="password" name="password"/> <br/>
验证码： <input type="text" name="verifycode" size="4"/> 
<img id="change" src="<%=request.getContextPath()%>/verify.do?method=verify"/>
<a  href=javascript:_change()>换一张</a><br/>
<input type="submit" value="submit"/>  
</form>
</body>
</html>