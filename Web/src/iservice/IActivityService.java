package iservice;

import java.util.List;
import table.Activity;
import table.Club;

public interface IActivityService {
	public void addActivity(Activity activity);			//增加(申请)一个活动
	public boolean isExistActivity(String clubname);		//根据活动名称判断活动是否存在
	public List<Activity> listAllActivity();				//列出所有活动(包括未批准)
	public List<Activity> listAllActivityActivated();		//列出所有有效的活动
	public Club getActivityById(String activityid);			//根据活动id获取一个活动信息
	public Club setClubActivate(String activityid);			//批准一个活动
	public boolean deleteActivity(String activityid);		//删除一个活动
	public Club changeActivity(Activity activity);			//修改一个活动信息
}
