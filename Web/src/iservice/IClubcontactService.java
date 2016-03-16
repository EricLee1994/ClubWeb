package iservice;

import java.util.List;

import table.Club;
import table.Clubcontact;
import table.Userinfo;

public interface IClubcontactService {	
	public boolean isExistClubContact(int userid,String clubid);			//检测学员是否已经加入社团
	public boolean joinAClub(int userid,String clubid);					//学员申请加入一个社团
	public boolean setClubContactActivate(String userid,String clubid);	//批准学员加入社团
	public Clubcontact findByUserIdAndClubId(String userid,String clubid);	//根据学员id和社团id查找一个映射
	public List<Userinfo> listAllMemberActivated(String clubid);			//列出所有已经批准学员
	public List<Userinfo> listAllMemberNotActivated(String clubid);			//列出所有未批准学员
	public List<Userinfo> listAllMember(String clubid);						//列出所有学员(包括未批准)
	public boolean deleteAMember(String ClubContactId);					//删除一个社团中的成员
	public boolean deleteAMember(Clubcontact clubc);						//删除一个社团中的成员
	public List<Club> listClubsActByUserId(int userid);					//根据学员id列出已经批准的社团
	public List<Club> listClubsActByUserId(String userid);					//根据学员id列出已经批准的社团
	public List<Club> listClubsNotActByUserId(int userid);					//根据学员id列出未批准的社团
	public List<Club> listClubsNotActByUserId(String userid);				//根据学员id列出未批准的社团
}
