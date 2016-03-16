package action;

import iservice.IClubService;
import iservice.IClubcontactService;
import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import table.Club;

public class ShowOneClubInfoAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3992950431070733233L;
	private IClubService clubService;
	private IClubcontactService clubcontactService;
	private String clubid;


	public IClubcontactService getClubcontactService() {
		return clubcontactService;
	}


	public void setClubcontactService(IClubcontactService clubcontactService) {
		this.clubcontactService = clubcontactService;
	}


	public IClubService getClubService() {
		return clubService;
	}


	public void setClubService(IClubService clubService) {
		this.clubService = clubService;
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
		if(clubid == null){
			request.put("info", "社团id错误!");
			return "faile";
		}
		
		Club club = clubService.getClubById(clubid);
		if(club != null){
			request.put("clubinfo", club);
			request.put("users", clubcontactService.listAllMemberActivated(clubid));
			
			return "success";
		}
		else{
			request.put("info", "读取社团信息失败!");
			return "faile";
		}


	}

}
