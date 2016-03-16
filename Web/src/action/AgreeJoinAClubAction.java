package action;

import java.util.Map;

import iservice.IClubcontactService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import comm.StrToInt;

public class AgreeJoinAClubAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5003215715982940275L;
	private IClubcontactService clubcontactService;
	private String clubid;
	private String userid;
	private String reloadurl;
	
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getReloadurl() {
		return reloadurl;
	}
	public void setReloadurl(String reloadurl) {
		this.reloadurl = reloadurl;
	}
	
	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String execute() {
		
		ActionContext context = ActionContext.getContext();
		Map request = (Map) context.get("request");
		//int userid = (Integer) context.getSession().get("userid");
		
		if( clubid == null || "".equals(clubid) ){
			request.put("info", "社团id错误!");
			return "faile";
		}
		if( userid == null || "".equals(userid) ){
			request.put("info", "学员id错误!");
			return "faile";
		}
		
		if(clubcontactService.isExistClubContact(StrToInt.strToInt(userid), clubid)){
			if(clubcontactService.setClubContactActivate(userid, clubid)){
				request.put("info", "操作成功!");
				request.put("url", reloadurl);
				return "success";
			}
			else{
				request.put("info", "操作错误!");
				return "faile";
			}
		}
		else{
			request.put("info", "操作错误!");
			return "faile";
		}
		
		
	}
	
}
