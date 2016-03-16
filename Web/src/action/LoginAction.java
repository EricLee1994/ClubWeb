package action;

import iservice.IClubService;
import iservice.ILoginService;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import service.LoginService;
import table.Club;
import table.Userinfo;

public class LoginAction {
	private ILoginService loginService;
	private IClubService clubService;
	private String username;
	private String password;
	
	public ILoginService getLoginService() {
		return loginService;
	}


	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}


	public IClubService getClubService() {
		return clubService;
	}


	public void setClubService(IClubService clubService) {
		this.clubService = clubService;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@SuppressWarnings("unchecked")
	public String execute() {
		
		if(loginService.isAdmin(username, password)){
			ActionContext context = ActionContext.getContext();
			Map sesson = context.getSession();
			//Map request = (Map) context.get("request");
			//request.put("userinfo", loginService.userInfo(userid));
			sesson.put("loginname", "超级管理员");
			sesson.put("isadmin", true);
			sesson.put("ismanger", false);
			sesson.put("isuser", false);
			return "success";
		}
		if (loginService.isUser(username, password)) {
			ActionContext context = ActionContext.getContext();
			Map sesson = context.getSession();
			//Map request = (Map) context.get("request");
			//request.put("userinfo", loginService.userInfo(userid));
			
			Userinfo user = loginService.getUserInfo(username);
			sesson.put("userid", user.getId());
			sesson.put("loginname", user.getName());
			
			List<Club> list = clubService.listClubByChrageId(user.getId());
			if(list != null && list.size() > 0){
				sesson.put("ismanger", true);
				sesson.put("clubid", list.get(0).getId());
			}
			else{
				sesson.put("ismanger", false);
			}
			sesson.put("isuser", true);
			sesson.put("isadmin", false);
			return "success";
			
		} else {
			ActionContext context = ActionContext.getContext();
			Map sesson = context.getSession();
			Map request = (Map) context.get("request");
			//request.put("userinfo", loginService.userInfo(userid));
			request.put("info", "用户名或者密码错误!");
			return "faile";
		}

	}

}
