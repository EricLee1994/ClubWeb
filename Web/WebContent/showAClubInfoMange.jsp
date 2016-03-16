<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>社团管理</title>
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
						<td height="31"><div class="titlebt">社团管理</div></td>
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
									<td class="left_txt">当前位置：社团管理</td>
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
												请根据以下要求输入社团的信息
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
												<td class="left_bt2">&nbsp;&nbsp;&nbsp;&nbsp;社团管理</td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td>
									<table width="100%" border="0" cellspacing="0"
											cellpadding="0">
											<form name="form1" method="POST" action="changeAClubInfo.action">
												<input name="id" type="hidden" value='<c:out value="${requestScope.club.getId()}" default=""/>'>
												<tr>
													<td height="30" align="right" class="left_txt2">社团id</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="content"
														size="30" value='<c:out value="${requestScope.club.getId()}" default=""/>' disabled="disabled"/></td>
													<td height="30" class="left_txt">社团id</td>
												</tr>
												<tr>
													<td width="20%" height="30" align="right" bgcolor="#f2f2f2"
														class="left_txt2">社团名称</td>
													<td width="3%" bgcolor="#f2f2f2">&nbsp;</td>
													<td width="32%" height="30" bgcolor="#f2f2f2"><input
														name="clubname" type="text" id="title" size="30" value='<c:out value="${requestScope.club.getClubname()}" default=""/>' /></td>
													<td width="45%" height="30" bgcolor="#f2f2f2"
														class="left_txt">社团名称</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2">社团活动内容</td>
													<td>&nbsp;</td>
													<td height="30"><input type="text" name="content"
														size="30" value='<c:out value="${requestScope.club.getContent()}" default=""/>'/></td>
													<td height="30" class="left_txt">社团活动内容</td>
												</tr>
												<tr>
													<td height="100" align="right" bgcolor="#f2f2f2"
														class="left_txt2">备注</td>
													<td bgcolor="#f2f2f2">&nbsp;</td>
													<td bgcolor="#f2f2f2">
														<textarea rows="6" cols="23" name="comment" size="30"><c:out value="${requestScope.club.getComment()}" default=""/></textarea>
													</td>
													<td bgcolor="#f2f2f2" class="left_txt">备注</td>
												</tr>
												<tr>
													<td height="30" align="right" class="left_txt2"></td>
													<td >
														<input type="submit" value="提交" name="B1" />

													</td>
													<td ><input type="reset" value="重置" name="B12" /></td>
													<td >&nbsp;</td>
												</tr>
											</from>
										</table>
										</td>
								</tr>
							</table>
							</td>
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