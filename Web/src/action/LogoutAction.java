package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import service.LoginService;

public class LogoutAction {

	@SuppressWarnings("unchecked")
	public String execute() {
		ActionContext context = ActionContext.getContext();
		Map sesson = context.getSession();
		sesson.remove("loginname");
		sesson.remove("isadmin");
		sesson.remove("ismanger");
		sesson.remove("clubid");
		sesson.remove("isuser");
		sesson.remove("userid");
		Map request = (Map) context.get("request");
		request.put("info", "退出登录!");
		request.put("url", "login.jsp");
		return "success";
	}

}
