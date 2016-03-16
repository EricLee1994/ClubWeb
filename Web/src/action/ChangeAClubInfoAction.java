package action;

import java.util.Map;
import table.Club;
import iservice.IClubService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeAClubInfoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6216706085569036162L;
	private IClubService clubService;
	private String id;
	private String clubname;
	private String content;
	private String comment;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
//		Map session = context.getSession();
//		int userid = (Integer)session.get("userid");
		Club club = clubService.findById(id);
		club.setClubname(clubname);
		club.setContent(content);
		club.setComment(comment);
		clubService.changeClub(club);

		request.put("info", "修改社团信息成功!");
		request.put("url", "showAClubInfoMange.action");
		return "success";

	}
	
	
	
}
