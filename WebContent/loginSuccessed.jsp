<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Success</title>
</head>
<body>
<%=request.getAttribute("user") %>,Login Success!
<%
	String[][] items = (String[][])request.getAttribute("items");
	for(int i = 0;i < items.length;i++) {
		for(int j = 0; j < items[i].length; j++) {
			 out.print(items[i][j] + " ");
		}
	}
%>

<input type="hidden" id="userName" value="Liming" />

<script>
var userName = $("userName").val();
alert(userName);
</script>
</body>
</html>