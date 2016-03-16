<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String loginname = (String) session.getAttribute("loginname");
	if( loginname != null && !"".equals(loginname)){
		response.sendRedirect("index.jsp");
	}
%>
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
			<td valign="top"><table width="100%" height="532" border="0"
					cellpadding="0" cellspacing="0" class="login_bg">
					<tr>
						<td width="49%" align="right"></td>
						<td width="1%">&nbsp;</td>
						<td width="50%" valign="bottom"><table width="100%"
								height="59" border="0" align="center" cellpadding="0"
								cellspacing="0">
								<tr>
									<td width="4%">&nbsp;</td>
									<td width="96%" height="38"><span class="login_txt_bt">登陆学生信息管理系统</span></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td height="21">
									<table cellSpacing="0" cellPadding="0" width="100%" border="0" id="table211" height="328">
											<tr>
												<td height="164" colspan="2" align="middle">
												<form name="myform" action="login.action" method="post">
														<table cellSpacing="0" cellPadding="0" width="100%" border="0" height="100" id="table212" >
															<tr align="left">
																<td width="13%" height="38" class="top_hui_text"><span
																	class="login_txt">用户名：&nbsp;&nbsp; </span></td>
																<td height="38" colspan="2" class="top_hui_text">
																	<input name="username" class="editbox4" value="" size="20">
																</td>
															</tr>
															<tr align="left">
																<td width="13%" height="35" class="top_hui_text"><span
																	class="login_txt"> 密 码： &nbsp;&nbsp; </span></td>
																<td height="35" colspan="2" class="top_hui_text">
																	<input name="password" class="editbox4" type="password" size="20" > 
																	<img src="images/luck.gif" width="19" height="18">
																</td>
															</tr>
															<tr align="left" style="display:none">
																<td width="13%" height="35"><span
																	class="login_txt">验证码：</span></td>
																<td height="35" colspan="2" class="top_hui_text"><input
																	class=wenbenkuang name=verifycode type=text value=""
																	maxLength=4 size=10></td>
															</tr>
															<tr align="left">
																<td height="35">&nbsp;</td>
																<td width="25%" height="35">
																	<input name="Submit" type="submit" class="button" id="Submit" value="登 陆">
																	
																	<input name="cs" type="button" class="button" id="cs" value="注册" onClick="location.href='register.jsp'">
																</td>
																<td width="67%" class="top_hui_text">
																
																</td>
															</tr>
														</table>
														<br>
													</form></td>
											</tr>
											<tr>
												<td width="433" height="164" align="right" valign="bottom"><img
													src="images/login-wel.gif" width="242" height="138"></td>
												<td width="57" align="right" valign="bottom">&nbsp;</td>
											</tr>
										</table>
										</td>
								</tr>
							</table></td>
					</tr>
				</table></td>
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