package action;

import java.util.List;
import java.util.Map;

import table.Club;
import iservice.IClubService;
import iservice.IUserinfoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAClubInfoMangeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5155522932487457234L;
	private IClubService clubService;
	private String clubid;
	
	public String getClubid() {
		return clubid;
	}
	public void setClubid(String clubid) {
		this.clubid = clubid;
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
		
		Club club = null;
		//社团长
		if( (clubid == null || "".equals(clubid)) && (Boolean) context.getSession().get("ismanger") ){
			int clubid = (Integer) context.getSession().get("clubid");
			club = clubService.findById(clubid+"");
		}
		//管理员
		else if( (Boolean) context.getSession().get("isadmin") ){
			club = clubService.findById(clubid);
		}
		else{
			request.put("info", "没有权限!");
			return "faile";
		}
		
		if(club != null){
			request.put("club", club);
			return "success";
		}
		else{
			request.put("info", "未知错误!");
			return "faile";
		}


	}
	
}
