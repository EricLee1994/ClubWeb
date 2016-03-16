package action;

import iservice.IClubcontactService;
import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import table.Club;

public class DeleteClubContactAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private IClubcontactService clubcontactService;
	private String userid;
	private String clubid;
	private String reloadurl;
	
	public String getReloadurl() {
		return reloadurl;
	}

	public void setReloadurl(String reloadurl) {
		this.reloadurl = reloadurl;
	}

	public IClubcontactService getClubcontactService() {
		return clubcontactService;
	}

	public void setClubcontactService(IClubcontactService clubcontactService) {
		this.clubcontactService = clubcontactService;
	}


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
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
		if(userid == null || "".equals(userid) || clubid == null || "".equals(clubid)){
			request.put("info", "社团id或者用户id错误!");
			request.put("url", reloadurl);
			return "faile";
		}
		
		if(clubcontactService.findByUserIdAndClubId(userid, clubid) != null && clubcontactService.deleteAMember(clubcontactService.findByUserIdAndClubId(userid, clubid))){
			request.put("info", "操作成功!");
			request.put("url", reloadurl);
			return "success";
		}
		else{
			request.put("info", "操作失败!");
			request.put("url", reloadurl);
			return "faile";
		}
		

	}

}
