<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>社团信息</title>
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
						<td height="31"><div class="titlebt">社团信息</div></td>
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
									<td class="left_txt">当前位置：社团信息</td>
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
												社团信息
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
												<td class="left_bt2">&nbsp;&nbsp;&nbsp;&nbsp;已经加入的社团</td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td>
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr class="left_txt2" align="center">
												<th height="30">社团id</th>
												<th >社团名称</th>
												<th >活动内容</th>
												<th >负责人</th>
												<th >成立时间</th>
												<th >备注</th>
												<th >操作</th>
											</tr>
											<c:forEach items="${requestScope.clubsActvite}" var="club" varStatus="s">
												<c:url value="deleteClubContact.action" var="deleteUrl">
													<c:param name="clubid" value="${club.getId() }"/>
													<c:param name="userid" value="${requestScope.userid }"/>
													<c:param name="reloadurl" value="${requestScope.reloadurl }"/>
												</c:url>
												<c:url value="showOneClubInfo.action" var="clubInfoUrl">
													<c:param name="clubid" value="${club.getId() }"/>
												</c:url>
												<tr <c:if test="${s.count % 2 == 1 }">bgcolor="#f2f2f2"</c:if> align="center" class="left_txt2">
													<td height="30" ><c:out value="${club.getId() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getClubname() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getContent() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getChrageUser().getName() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getSetuptime() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getComment() }" default="错误信息"/></td>
													<td >
														<a href='<c:out value="${clubInfoUrl }" default="#" />' class="active">进入主页</a>
														<a href='<c:out value="${deleteUrl }" default="#" />' class="active">退出社团</a>
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
												<td class="left_bt2">&nbsp;&nbsp;&nbsp;&nbsp;申请中的社团</td>
											</tr>
										</table></td>
								</tr>
								<tr>
									<td>
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr class="left_txt2" align="center">
												<th height="30">社团id</th>
												<th >社团名称</th>
												<th >活动内容</th>
												<th >负责人</th>
												<th >成立时间</th>
												<th >备注</th>
												<th >操作</th>
											</tr>
											<c:forEach items="${requestScope.clubsNotActvite}" var="club" varStatus="s">
												<c:url value="deleteClubContact.action" var="deleteUrl">
													<c:param name="clubid" value="${club.getId() }"/>
													<c:param name="userid" value="${requestScope.userid }"/>
													<c:param name="reloadurl" value="${requestScope.reloadurl }"/>
												</c:url>
												<c:url value="showOneClubInfo.action" var="clubInfoUrl">
													<c:param name="clubid" value="${club.getId() }"/>
												</c:url>
												<tr <c:if test="${s.count % 2 == 1 }">bgcolor="#f2f2f2"</c:if> align="center" class="left_txt2">
													<td height="30" ><c:out value="${club.getId() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getClubname() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getContent() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getChrageUser().getName() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getSetuptime() }" default="错误信息"/></td>
													<td height="30" ><c:out value="${club.getComment() }" default="错误信息"/></td>
													<td >
														<a href='<c:out value="${clubInfoUrl }" default="#" />' class="active">进入主页</a>
														<a href='<c:out value="${deleteUrl }" default="#" />' class="active">取消申请</a>
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