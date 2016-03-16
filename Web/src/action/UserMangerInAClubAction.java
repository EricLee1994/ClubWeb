package action;

import java.util.List;
import java.util.Map;

import table.Club;
import table.Userinfo;
import iservice.IClubService;
import iservice.IClubcontactService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserMangerInAClubAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3172813361893797940L;
	private IClubcontactService clubcontactService;
	private IClubService clubService;
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
		Map session = (Map) context.getSession();
		//处理权限
		
		System.out.println("session.get(\"ismanger\")="+session.get("ismanger"));
		System.out.println("clubid="+clubid);
		System.out.println("session.get(\"isadmin\")="+session.get("isadmin"));
		
		//社团长
		if( (Boolean) session.get("ismanger") ){
			clubid = ((Integer) context.getSession().get("clubid"))+"";
		}
		//管理员
		else if((Boolean) session.get("isadmin") && clubid != null && !"".equals(clubid) ){
			//club = clubService.findById(clubid);
			;
		}
		else{
			request.put("info", "没有权限!");
			return "faile";
		}
		
		Club club = clubService.findById(clubid);
		if(club == null ){
			request.put("info", "社团id错误!");
			return "faile";
		}
		
		List<Userinfo> MemberNotActivated = clubcontactService.listAllMemberNotActivated(clubid);
		List<Userinfo> MemberActivated = clubcontactService.listAllMemberActivated(clubid);
		
		request.put("MemberNotActivated", MemberNotActivated);
		request.put("MemberActivated", MemberActivated);
		request.put("club", club);
		request.put("reloadurl", "userMangerInAClub.action");
		return "success";
		
	}
}
