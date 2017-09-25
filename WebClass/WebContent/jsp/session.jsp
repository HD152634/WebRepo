<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	Integer cnt = (Integer)session.getAttribute("cnt");
	if(cnt == null){
		out.println("최초 호출");
		cnt = 0;
	}
	session.setAttribute("cnt",++cnt);
%>
<h1>cnt : <%= cnt %></h1>
<br>
<%= request.getHeader("cookie") %>
</body>
</html>