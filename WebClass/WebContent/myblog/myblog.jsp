<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="org.dimigo.vo.UserVO"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<!-- Required meta tags -->
<meta charset="utf-8">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
	integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
	integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
	crossorigin="anonymous"></script>

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
<script src="../js/myblog.js"></script>
<link rel="stylesheet" type="text/css" href="../css/myblog.css">
<title>�ϳ��� �ְ�</title>


</head>

<body onload="alert('�ݰ���');">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="myblog.html">Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item" onmouseover="menu_over(this);"
					onmouseout="menu_out(this)"><a class="nav-link"
					href="hana.html">HANA <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item" onmouseover="menu_over(this);"
					onmouseout="menu_out(this)"><a class="nav-link"
					href="hobby.html">Hobby</a></li>
				<li class="nav-item" onmouseover="menu_over(this);"
					onmouseout="menu_out(this)"><a class="nav-link"
					href="dream.html">Dream</a></li>
			</ul>
			<%
				UserVO user = (UserVO) session.getAttribute("user");
				if (user == null) {
			%>
			<form class="form-inline my-2 my-lg-0" id="loginForm" action="/WebClass/bloglogin" method="post">
	
				<input class="form-control mr-sm-2" type="email" name="id" placeholder="ID" aria-label="ID" id="id" required
					<%if (request.getParameter("id") == null) {%> value="" 
					<%} else {%>
					value="<%=request.getParameter("id")%>" <%}%>> <input
					class="form-control mr-sm-2" type="password" placeholder="PWD"
					aria-label="PWD" id="pwd" required>
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">�α���</button>
				<button class="btn btn-outline-success my-2 my-sm-0" type="button"
					onclick="location.href='join.html'">ȸ������</button>
			</form>
<%
				} else {
			%>
			<ul class="navbar-nav flex-row ml-md-auto d-none d-md-flex">
				<li class="nav-item dropdown"><a
					class="nav-item nav-link dropdown-toggle mr-md-2" href="#"
					id="bd-versions" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <%=user.getName()%> ��
				</a>
					<div class="dropdown-menu dropdown-menu-right"
						aria-labelledby="bd-versions">
						<form action="/WebClass/bloglogout" method="post">
							<button type="submit" class="dropdown-item">Sign out</button>
						</form>
						<div class="dropdown-divider"></div>
						<button type="button" class="dropdown-item">Action1</button>
						<button type="button" class="dropdown-item">Action2</button>

					</div></li>
			</ul>
			<%
				} 	
			%>
		</div>
	</nav>

	<div class="modal" id="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">�α��� ���</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<p></p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Save changes</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<h1>�ȳ� ����� �ϳ����� ��α״�!</h1>
		<p></p>
	</div>

	<img src="/WebClass/myblog/main.png" alt = "main">
	
	

	<p>INFORMATION</p>
	<input type="button" onclick="greeting('k');" value="��ȭ��ȣ">
	<button type="button" onclick="greeting('e');">�̸���</button>
	<button onclick="greeting('c');">���ּ�</button>
	<p id="result"></p>


</body>
</html>