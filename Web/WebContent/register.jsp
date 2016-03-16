<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>注册</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="images/skin.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #F8F9FA;
}
-->
</style>
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="17" height="29" valign="top"
				background="images/mail_leftbg.gif"><img
				src="images/left-top-right.gif" width="17" height="29" />
			</td>
			<td width="935" height="29" valign="top" background="images/content-bg.gif">
			<table width="100%"
					height="31" border="0" cellpadding="0" cellspacing="0"
					class="left_topbg" id="table2">
					<tr>
						<td height="31"><div class="titlebt">注册</div></td>
					</tr>
			</table>
			</td>
			<td width="16" valign="top" background="images/mail_rightbg.gif"><img src="images/nav-right-bg.gif" width="16" height="29" />
			</td>
		</tr>
		<tr>
			<td height="71" valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
			<td valign="top" bgcolor="#F7F8F9"><table width="100%"
					height="138" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td height="13" valign="top">&nbsp;</td>
					</tr>
					<tr>
						<td valign="top"><table width="98%" border="0" align="center"
								cellpadding="0" cellspacing="0">
								<tr>
									<td class="left_txt">当前位置：注册</td>
								</tr>
								<tr>
									<td height="20"><table width="100%" height="1" border="0"
											cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
											<tr>
												<td></td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td><table width="100%" height="55" border="0"
											cellpadding="0" cellspacing="0">
											<tr>
												<td width="10%" height="55" valign="middle"><img
													src="images/title.gif" width="54" height="55">
												</td>
												<td width="90%" valign="top">
												请根据以下要求输入您的信息
												</td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td><table width="100%" height="31" border="0"
											cellpadding="0" cellspacing="0" class="nowtable">
											<tr>
												<td class="left_bt2">&nbsp;&nbsp;&nbsp;&nbsp;注册信息填写</td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td>
									<table width="100%" border="0" cellspacing="0"
											cellpadding="0">
											<form name="form1" method="POST" action="register.action">
												<tr>
													<td width="20%" height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">用户名</td>
													<td width="3%" bgcolor="#f2f2f2">&nbsp;</td>
													<td width="32%" height="30" bgcolor="#f2f2f2"><input
														name="username" type="text" id="title" size="30" /></td>
													<td width="45%" height="30" bgcolor="#f2f2f2"
														class="left_txt">网站登录用户名</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">密码</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="password"
														size="30" /></td>
													<td height="30" class="left_txt">网站登录密码</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">真实姓名</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="name" size="30" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">真实姓名,请如实填写</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">学校</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="school" size="30" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">所在学校</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">年龄
													</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="age"
														size="30" /></td>
													<td height="30" class="left_txt">真实年龄</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">班级</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td height="30" bgcolor="#f2f2f2"><input type="text"
														name="class_" size="30" /></td>
													<td height="30" bgcolor="#f2f2f2" class="left_txt">所在班级</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#F7F8F9"
														class="left_txt2">邮箱</td>
													<td bgcolor="#F7F8F9">&nbsp;</td>
													<td height="30" bgcolor="#F7F8F9"><input type="text"
														name="email" size="30" /></td>
													<td height="30" bgcolor="#F7F8F9" class="left_txt">常用邮箱</td>
												</tr>
												<tr>
													<td height="30" align="right" bgcolor="#F2F2F2"
														class="left_txt2">备注</td>
													<td bgcolor="#F2F2F2">&nbsp;</td>
													<td height="30" bgcolor="#F2F2F2"><input name="commont"
														type="text" id="mymail" size="30" /></td>
													<td height="30" bgcolor="#F2F2F2"><span
														class="left_txt">备注说明</span></td>
												</tr>
										</table>
										</td>
								</tr>
							</table>
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="50%" height="30" align="right">
									<input type="submit" value="提交" name="B1" />
									</td>
									<td width="6%" height="30" align="right">&nbsp;
									</td>
									<td width="44%" height="30">
									<input type="reset" value="重置" name="B12" />
									</td>
								</tr>
								<tr>
									<td height="30" colspan="3">&nbsp;</td>
								</tr>
							</table></td>
					</tr>
				</table></td>
			<td background="images/mail_rightbg.gif">&nbsp;</td>
		</tr>
		<tr>
			<td valign="middle" background="images/mail_leftbg.gif"><img
				src="images/buttom_left2.gif" width="17" height="17" /></td>
			<td height="17" valign="top" background="images/buttom_bgs.gif"><img
				src="images/buttom_bgs.gif" width="17" height="17" /></td>
			<td background="images/mail_rightbg.gif"><img
				src="images/buttom_right2.gif" width="16" height="17" /></td>
		</tr>
	</table>

</body>
</html>