<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charser=UTF-8"); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>묵시적 형 변환</h1>
	<p>대입 연산에서 왼쪽의 자료형이 오른쪽 결과의 자료형 보다 클 때 발생한다.</p>
	<p>이것은 결과적으로 큰것에 작은것을 담는 것과 같은 것이 된다.</p>

<%
	int i = 'A';// 정수형 변수 i에 문자 'A'를 대입하면 정수 65로 자동 형변환된다.
	float f = 10;//실수형 변수 f에 정수 10을 대입하면 자동으로 실수 10.0f로 자동 형변환 된다.
	
	out.print("i의 값은 : " + i +"<br/>");
	out.print("f의 값은 : " + f);
%>	
	

</body>
</html>