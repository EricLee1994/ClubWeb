package action;

import iservice.IClubService;
import iservice.IClubcontactService;
import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import table.Club;

public class ListClubsActivitedAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IClubService clubService;
	private IClubcontactService clubcontactService;
	
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


	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String execute() {
		
		ActionContext context = ActionContext.getContext();
		Map request = (Map) context.get("request");
		int userid = (Integer) context.getSession().get("userid");
		
		List<Club> clubsActvite = clubService.listAllClubActivated();
		if( clubsActvite != null && clubsActvite.size()>0 ){
			int num1 = 0;
			int num2 = 0;
			List<Club> list1 = clubcontactService.listClubsActByUserId(userid);
			List<Club> list2 = clubcontactService.listClubsNotActByUserId(userid);
			if(list1 != null && list1.size()>0)
				num1 = list1.size();
			if(list2 != null && list2.size()>0)
				num2 = list2.size();
			if(num1 + num2 >= 3){
				request.put("warning", "您已经加入了"+num1+"个社团，正在申请"+num2+"个社团，已经不能再申请社团了!");
				request.put("isallowed", false);
			}
			else{
				int left = 3 - num1 -num2;
				request.put("warning", "您已经加入了"+num1+"个社团，正在申请"+num2+"个社团，可以再申请"+left+"个社团!");
				request.put("isallowed", true);
			}
			
			request.put("clubsActvite", clubsActvite);
			//request.put("userid", userid);
			request.put("reloadurl", "listClubsActivited.action");
			return "success";
		}
		else{
			request.put("info", "没有可加入社团或者未知错误!");
			return "faile";
		}

	}

}
