package action;

import iservice.IClubcontactService;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class JoinAClubAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private IClubcontactService clubcontactService;
	private String clubid;
	
	public IClubcontactService getClubcontactService() {
		return clubcontactService;
	}
	public void setClubcontactService(IClubcontactService clubcontactService) {
		this.clubcontactService = clubcontactService;
	}
	public String getClubid() {
		return clubid;
	}
	public void setClubid(String clubid) {
		this.clubid = clubid;
	}
	
	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String execute() {
		
		ActionContext context = ActionContext.getContext();
		Map request = (Map) context.get("request");
		int userid = (Integer) context.getSession().get("userid");
		
		if( clubid == null || "".equals(clubid) ){
			request.put("info", "社团id错误!");
			return "faile";
		}
		if( clubcontactService.isExistClubContact(userid, clubid) ){
			request.put("info", "您已经加入或者申请这个社团!");
			return "faile";
		}
		else{
			if(clubcontactService.joinAClub(userid, clubid)){
				request.put("info", "成功申请加入社团!");
				return "success";
			}
			else{
				request.put("info", "未知错误，未能申请加入社团!");
				return "faile";
			}
		}
		
	}
	
}
