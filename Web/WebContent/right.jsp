<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="images/skin.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #EEF2FB;
}
-->
</style>
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="17" valign="top" background="images/mail_leftbg.gif"><img
				src="images/left-top-right.gif" width="17" height="29" /></td>
			<td valign="top" background="images/content-bg.gif">
				<table width="100%" height="31" border="0" cellpadding="0"
					cellspacing="0" class="left_topbg" id="table2">
					<tr>
						<td height="31"><div class="titlebt">欢迎界面</div></td>
					</tr>
				</table>
			</td>
			<td width="16" valign="top" background="images/mail_rightbg.gif"><img
				src="images/nav-right-bg.gif" width="16" height="29" />
			</td>
		</tr>
		<tr>
			<td valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
			<td valign="top" bgcolor="#F7F8F9"><table width="98%" border="0"
					align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td colspan="2" valign="top">
							<!--JavaScript部分--> <SCRIPT language=javascript>
function secBoard(n)
{
for(i=0;i<secTable.cells.length;i++)
secTable.cells[i].className="sec1";
secTable.cells[n].className="sec2";
for(i=0;i<mainTable.tBodies.length;i++)
mainTable.tBodies[i].style.display="none";
mainTable.tBodies[n].style.display="block";
}
          </SCRIPT> <!--HTML部分-->
							<TABLE width=72% border=0 cellPadding=0 cellSpacing=0 id=secTable>
								<TBODY>
									<TR align=middle height=20>
										<TD align="center" class=sec2 onclick=secBoard(0)>验证信息</TD>
										<TD align="center" class=sec1 onclick=secBoard(1)>统计信息</TD>
										<TD align="center" class=sec1 onclick=secBoard(2)>系统参数</TD>
										<TD align="center" class=sec1 onclick=secBoard(3)>版权说明</TD>
									</TR>
								</TBODY>
							</TABLE>
							<TABLE class=main_tab id=mainTable cellSpacing=0 cellPadding=0
								width=100% border=0>
								<!--关于TBODY标记-->
								<TBODY style="DISPLAY: block">
								</TBODY>
								<!--关于cells集合-->
								<TBODY style="DISPLAY: none">
								</TBODY>
								<!--关于tBodies集合-->
								<TBODY style="DISPLAY: none">
								</TBODY>
								<!--关于display属性-->
								<TBODY style="DISPLAY: none">
								</TBODY>
							</TABLE>
						</td>
					</tr>
				</table></td>
			<td background="images/mail_rightbg.gif">&nbsp;</td>
		</tr>
		<tr>
			<td valign="bottom" background="images/mail_leftbg.gif"><img
				src="images/buttom_left2.gif" width="17" height="17" /></td>
			<td background="images/buttom_bgs.gif"><img
				src="images/buttom_bgs.gif" width="17" height="17"></td>
			<td valign="bottom" background="images/mail_rightbg.gif"><img
				src="images/buttom_right2.gif" width="16" height="17" /></td>
		</tr>
	</table>
</body>
</html>