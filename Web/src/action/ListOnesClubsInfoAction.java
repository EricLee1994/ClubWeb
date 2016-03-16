package action;

import iservice.IClubcontactService;
import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import table.Club;

public class ListOnesClubsInfoAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IClubcontactService clubcontactService;
	private String userid;

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


	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String execute() {
		
		ActionContext context = ActionContext.getContext();
		Map request = (Map) context.get("request");
		if(userid == null){
			userid = context.getSession().get("userid")+"";
		}
		
		List<Club> clubsActvite = clubcontactService.listClubsActByUserId(userid);
		List<Club> clubsNotActvite = clubcontactService.listClubsNotActByUserId(userid);
		
		//System.out.println("clubsNotActvite.size()="+clubsNotActvite.size());
		
		if((clubsActvite != null && clubsActvite.size()>0) || (clubsNotActvite != null && clubsNotActvite.size()>0) ){
			request.put("clubsActvite", clubsActvite);
			request.put("clubsNotActvite", clubsNotActvite);
			request.put("userid", userid);
			request.put("reloadurl", "listOnesClubsInfo.action");
			return "success";
		}
		else{
			request.put("info", "您未参加任何社团");
			return "faile";
		}

	}

}
