<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>成员管理</title>
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
a.active{
	color: blue;
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
						<td height="31"><div class="titlebt">成员管理</div></td>
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
									<td class="left_txt">当前位置：成员管理</td>
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
												成员管理
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
												<td class="left_bt2">&nbsp;&nbsp;&nbsp;&nbsp;正在申请的成员</td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td>
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr class="left_txt2" align="center">
												<th height="30">学员id</th>
												<th >学员姓名</th>
												<th >学员年龄</th>
												<th >学员班级</th>
												<th >学员学校</th>
												<th >学员邮箱</th>
												<th >操作</th>
											</tr>
											<c:forEach items="${requestScope.MemberNotActivated}" var="user" varStatus="s">
												<!-- 学员详细页 -->
												<c:url value="userinfo.action" var="userInfoUrl">
													<c:param name="userid" value="${user.getId() }"/>
												</c:url>
												<!-- 同意加入社团 -->
												<c:url value="agreeJoinAClub.action" var="agreeUrl">
													<c:param name="clubid" value="${requestScope.club.getId() }"/>
													<c:param name="userid" value="${user.getId() }"/>
													<c:param name="reloadurl" value="${requestScope.reloadurl }"/>
												</c:url>
												<!-- 拒绝加入社团 -->
												<c:url value="deleteClubContact.action" var="deleteUrl">
													<c:param name="clubid" value="${requestScope.club.getId() }"/>
													<c:param name="userid" value="${user.getId() }"/>
													<c:param name="reloadurl" value="${requestScope.reloadurl }"/>
												</c:url>
												<tr <c:if test="${s.count % 2 == 1 }">bgcolor="#f2f2f2"</c:if> align="center" class="left_txt2">
													<td height="30" ><c:out value="${user.getId() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getName() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getAge() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getClass_() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getSchool() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getEmail() }" default="错误信息"/></td>
													<td >
														<a href='<c:out value="${userInfoUrl }" default="#" />' class="active">进入主页</a>

														<a href='<c:out value="${agreeUrl }" default="#" />' class="active">同意</a>
														<a href='<c:out value="${deleteUrl }" default="#" />' class="active">拒绝</a>
													</td>
												</tr>
											</c:forEach>
										</table>
									</td>
								</tr>
								
								
								<tr height="30px">
									<td> </td>
								</tr>


								<tr>
									<td><table width="100%" height="31" border="0"
											cellpadding="0" cellspacing="0" class="nowtable">
											<tr>
												<td class="left_bt2">&nbsp;&nbsp;&nbsp;&nbsp;正式成员</td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td>
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr class="left_txt2" align="center">
												<th height="30">学员id</th>
												<th >学员姓名</th>
												<th >学员年龄</th>
												<th >学员班级</th>
												<th >学员学校</th>
												<th >学员邮箱</th>
												<th >操作</th>
											</tr>
											<c:forEach items="${requestScope.MemberActivated}" var="user" varStatus="s">
												<!-- 学员详细页 -->
												<c:url value="userinfo.action" var="userInfoUrl">
													<c:param name="userid" value="${user.getId() }"/>
												</c:url>
												<!-- 拒绝加入社团 -->
												<c:url value="deleteClubContact.action" var="deleteUrl">
													<c:param name="clubid" value="${requestScope.club.getId() }"/>
													<c:param name="userid" value="${user.getId() }"/>
													<c:param name="reloadurl" value="${requestScope.reloadurl }"/>
												</c:url>
												<tr <c:if test="${s.count % 2 == 1 }">bgcolor="#f2f2f2"</c:if> align="center" class="left_txt2">
													<td height="30" ><c:out value="${user.getId() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getName() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getAge() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getClass_() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getSchool() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${user.getEmail() }" default="错误信息"/></td>
													<td >
														<a href='<c:out value="${userInfoUrl }" default="#" />' class="active">进入主页</a>
														<a href='<c:out value="${deleteUrl }" default="#" />' class="active">删除成员</a>
													</td>
												</tr>
											</c:forEach>
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