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
	<h1>자료형</h1>
	
	<h2>자바에서 제공하는 자료형은 크게 두가지</h2>
	<h3>1. 기본 자료형</h3>
	<table>
		<tr>
			<th>자료형(크기.bit)</th>
			<th>유효값</th>
		</tr>
		<tr>
			<th>boolean(8)</th>
			<td>true,false</td>
		</tr>
		<tr>
			<th>byte(8)</th>
			<td>-128~127(정수)</td>
		</tr>
		<tr>
			<th>char(16)</th>
			<td>유니코드문자</td>
		</tr>
		<tr>
			<th>...</th>
			<td>...</td>
		</tr>
		
		
	
	</table>
	
	<ol>
		<li><b>기본</b>
		
		
		</li>
		<li><b>참조</b></li>
	</ol>
	
	
	<p>
		<b>1. 기본 자료형</b>
		<br/>
		<b>2. 참조 자료형</b>
	</p>




</body>
</html>