<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String loginname = (String) session.getAttribute("loginname");
	if( loginname == null || "".equals(loginname)){
		response.sendRedirect("login.jsp");
	}
%>
<html>
<head>
<title>学员活动管理系统</title>
<meta http-equiv=Content-Type content=text/html;charset=utf-8>
</head>
<frameset rows="64,*" frameborder="NO" border="0" framespacing="0">
	<frame src="admin_top.jsp" noresize="noresize" frameborder="NO"
		name="topFrame" scrolling="no" marginwidth="0" marginheight="0"
		target="main" />
	<frameset cols="200,*" rows="560,*" id="frame">
		<frame src="left.jsp" name="leftFrame" noresize="noresize"
			marginwidth="0" marginheight="0" frameborder="0" scrolling="no"
			target="main" />
		<frame src="right.jsp" name="main" marginwidth="0" marginheight="0"
			frameborder="0" scrolling="auto" target="_self" />
	</frameset>
	<noframes>
		<body></body>
	</noframes>
</frameset>
</html>
