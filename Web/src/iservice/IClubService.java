package iservice;

import java.util.List;
import table.Club;

public interface IClubService {
	public void addClub(Club club);						//增加(申请)一个社团
	public boolean isExistClub(String clubname);			//根据社团名判断社团是否存在
	public boolean isExistClub(int usnerid);				//根据申请人id判断申请人是否已经申请社团
	public List<Club> listAllClub();						//列出所有社团(包括未批准)
	public List<Club> listAllClubActivated();				//列出所有有效的社团
	public Club getClubById(String clubid);					//根据社团id获取一个社团信息
	public Club setClubActivate(String clubid);				//批准一个社团
	public boolean deleteClub(String clubid);				//删除一个社团
	public Club changeClub(Club club);						//修改一个社团信息
	public List<Club> listClubByChrageId(int chrageid);	//根据社团长的id获取社团列表
	public Club findById(String id);							//获取一个社团信息
}
