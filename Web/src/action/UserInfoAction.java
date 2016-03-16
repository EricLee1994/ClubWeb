package action;

import iservice.IUserinfoService;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import comm.StrToInt;

import dao.UserinfoDAO;

import service.LoginService;
import table.Userinfo;

public class UserInfoAction {
	private IUserinfoService userinfoService;
	private String userid;
	
	
	public IUserinfoService getUserinfoService() {
		return userinfoService;
	}


	public void setUserinfoService(IUserinfoService userinfoService) {
		this.userinfoService = userinfoService;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String execute() {
		
		ActionContext context = ActionContext.getContext();
		Map request = (Map) context.get("request");
		Userinfo user = null;
		if(userid == null){
			int id = (Integer) context.getSession().get("userid");
			user = userinfoService.findUserById(id);
		}
		else{
			user = userinfoService.findUserById(userid);
		}

		if(user != null){
			request.put("user", user);
			return "success";
		}
		else{
			request.put("info", "用户id错误!");
			return "faile";
		}

	}

}
