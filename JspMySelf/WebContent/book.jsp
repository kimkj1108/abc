<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charser=UTF-8"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>변수</title>
</head>
<body>
<%
String name;
int	num;
name="홍길동";
num=20210320;
out.print(name + "<br>" + num);

%>
</body>
</html>