package iservice;

import java.util.List;
import table.Userinfo;

public interface IActivitycontactService {
	public boolean isInClub(int userid,String activityid);						//检测学员是否已经加入这个活动的社团
	public boolean isExistActivityContact(int userid,String activityid);			//检测学员是否已经加入活动
	public boolean joinActivity(int userid,String activityid);					//学员申请加入一个活动
	public boolean setActivityContactActivate(String userid,String activityid);	//批准学员加入活动
	public List<Userinfo> listAllMemberActivated();									//列出所有已经批准(活动的)学员
	public List<Userinfo> listAllMember();											//列出所有学员(包括未批准活动的)
	public boolean deleteAMember(String userid,String activityid);					//删除一个活动中的成员(拒绝)
}
