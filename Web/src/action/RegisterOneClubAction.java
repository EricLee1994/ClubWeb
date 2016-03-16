package action;

import iservice.IClubService;
import java.sql.Date;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import table.Club;

public class RegisterOneClubAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2073953632471301105L;
	private IClubService clubService;
	private String clubname;
	private String content;
	private String comment;

	public IClubService getClubService() {
		return clubService;
	}

	public void setClubService(IClubService clubService) {
		this.clubService = clubService;
	}

	public String getClubname() {
		return clubname;
	}

	public void setClubname(String clubname) {
		this.clubname = clubname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@SuppressWarnings("unchecked")
	public String execute() {
		ActionContext context = ActionContext.getContext();
		Map request = (Map) context.get("request");
		Map session = context.getSession();
		int userid = (Integer)session.get("userid");
		
		if(clubname == null || "".equals(clubname)){
			request.put("info", "社团名称不能为空!");
			return "faile";
		}
		if(content == null || "".equals(content)){
			request.put("info", "社团活动内容不能为空!");
			return "faile";
		}
		if( clubService.isExistClub(userid) ){
			request.put("info", "您已经申请过社团!");
			return "faile";
		}
		if( clubService.isExistClub(clubname) ){
			request.put("info", "已经存在相同社团名!");
			return "faile";
		}
		
		Club club = new Club();
		club.setClubname(clubname);
		club.setSetuptime(new Date(System.currentTimeMillis()));
		club.setContent(content);
		club.setComment(comment);
		club.setChrageid(userid);
		club.setFlag(false);
		clubService.addClub(club);
		System.out.println("新申请社团：club.getId()="+club.getId());
		System.out.println("新申请社团：club.getClubname()="+club.getClubname());

		request.put("info", "新申请成功!请耐心等待管理员的批准!");
		request.put("url", "right.jsp");
		return "success";

	}

}
