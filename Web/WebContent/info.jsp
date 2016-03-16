<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学生信息管理系统</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #1D3647;
}
-->
</style>
<link href="images/skin.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table width="100%" height="166" border="0" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="42" valign="top">
				<table width="100%" height="42"
					border="0" cellpadding="0" cellspacing="0" class="login_top_bg">
					<tr>
						<td width="1%" height="21">&nbsp;</td>
						<td height="42">&nbsp;</td>
						<td width="17%">&nbsp;</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td valign="top">
				<table width="100%" height="532" border="0"
					cellpadding="0" cellspacing="0" class="login_bg">
					<tr align="center">
						<td width="49%" align="center">&nbsp;</td>
					</tr>
					<tr align="center">
						<td width="49%" align="center">&nbsp;</td>
					</tr>
					<tr align="center">
						<td width="49%" align="center">
							<span class="login_txt_bt">
								<c:out value="${requestScope.info}" default="操作错误!"/>
							</span>
						</td>
					</tr>
					<tr align="center">
						<td width="49%" align="center">
							<c:choose>
								<c:when test="${requestScope.url == null}">
									<a href="#" onclick="javascript:history.go(-1);">返回</a>
								</c:when>
								<c:otherwise>
									<a href="<c:out value="${requestScope.url}" default="index.jsp"/>" onclick="">返回</a>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr align="center">
						<td width="49%" align="center">&nbsp;</td>
					</tr>
					<tr align="center">
						<td width="49%" align="center">&nbsp;</td>
					</tr>

				</table>
			</td>
		</tr>
		<tr>
			<td height="20"><table width="100%" border="0" cellspacing="0"
					cellpadding="0" class="login-buttom-bg">
					<tr>
						<td align="center"><span class="login-buttom-txt">Copyright
								&copy; 2013 </span></td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>