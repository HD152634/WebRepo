<!--  1. Directive tag (������) -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ù��° JSP</title>
</head>
<body>
<%-- 2.JSP �ּ� tag --%>
<%-- 3. Declaration tag (�����) --%>
<%! private static final String DEFAULT_NAME= "Guest"; %>
<%
	//�ڹ��ڵ带 �״�� �ۼ�
	String name = request.getParameter("name");
	if(name == null) name = DEFAULT_NAME;
	//out.println("<h1>Hello,"+name+"</h1>");

%>
<%-- 5. Expression tag(ǥ����) --%>
<h1>Hello, <%=name %></h1>

</body>
</html>