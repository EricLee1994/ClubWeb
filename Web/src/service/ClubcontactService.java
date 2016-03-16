package service;

import java.util.ArrayList;
import java.util.List;

import comm.StrToInt;

import dao.ClubDAO;
import dao.ClubcontactDAO;
import dao.UserinfoDAO;

import table.Club;
import table.Clubcontact;
import table.Userinfo;
import iservice.IClubcontactService;

public class ClubcontactService implements IClubcontactService {
	ClubDAO clubDAO;
	ClubcontactDAO clubcontactDAO;
	UserinfoDAO userinfoDAO;
	
	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}

	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}

	public ClubDAO getClubDAO() {
		return clubDAO;
	}

	public void setClubDAO(ClubDAO clubDAO) {
		this.clubDAO = clubDAO;
	}

	public ClubcontactDAO getClubcontactDAO() {
		return clubcontactDAO;
	}

	public void setClubcontactDAO(ClubcontactDAO clubcontactDAO) {
		this.clubcontactDAO = clubcontactDAO;
	}

	@Override
	public boolean isExistClubContact(int userid, String clubid) {
		// TODO Auto-generated method stub
		List<Clubcontact> list = clubcontactDAO.findByClubidAndUid(clubid, userid+"");
		if( list != null && list.size() > 0 ){
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean joinAClub(int userid, String clubid) {
		// TODO Auto-generated method stub
		Clubcontact clubc = new Clubcontact();
		clubc.setFlag(false);
		clubc.setUid(userid);
		clubc.setClubid(StrToInt.strToInt(clubid));
		clubcontactDAO.save(clubc);
		return true;
	}

	@Override
	public boolean setClubContactActivate(String userid, String clubid) {
		// TODO Auto-generated method stub
		List<Clubcontact> list = clubcontactDAO.findByClubidAndUid(clubid, userid);
		if(list != null && list.size() > 0 ){
			for(int i = 0;i<list.size();i++){
				list.get(i).setFlag(true);
				clubcontactDAO.attachDirty(list.get(i));
			}
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public List<Userinfo> listAllMemberActivated(String clubid) {
		// TODO Auto-generated method stub
		List<Clubcontact> list = clubcontactDAO.findAllActivated(clubid);
		ArrayList<Userinfo> listUserinfo = new ArrayList<Userinfo>();
		if(list != null && list.size() > 0 ){
			for(int i = 0;i<list.size();i++){
				listUserinfo.add(userinfoDAO.findById(list.get(i).getUid()));
			}
			return listUserinfo;
		}
		else{
			return null;
		}
	}
	
	@Override
	public List<Userinfo> listAllMemberNotActivated(String clubid) {
		// TODO Auto-generated method stub
		List<Clubcontact> list = clubcontactDAO.findAllNotActivated(clubid);
		ArrayList<Userinfo> listUserinfo = new ArrayList<Userinfo>();
		if(list != null && list.size() > 0 ){
			for(int i = 0;i<list.size();i++){
				listUserinfo.add(userinfoDAO.findById(list.get(i).getUid()));
			}
			return listUserinfo;
		}
		else{
			return null;
		}
	}
	
	@Override
	public List<Userinfo> listAllMember(String clubid) {
		// TODO Auto-generated method stub
		List<Clubcontact> list = clubcontactDAO.findAll(clubid);
		ArrayList<Userinfo> listUserinfo = new ArrayList<Userinfo>();
		if(list != null && list.size() > 0 ){
			for(int i = 0;i<list.size();i++){
				listUserinfo.add(userinfoDAO.findById(list.get(i).getUid()));
			}
			return listUserinfo;
		}
		else{
			return null;
		}
	}

	@Override
	public boolean deleteAMember(String ClubContactId) {
		// TODO Auto-generated method stub
		if(clubcontactDAO.findById(StrToInt.strToInt(ClubContactId)) != null){
			clubcontactDAO.delete(clubcontactDAO.findById(StrToInt.strToInt(ClubContactId)));
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAMember(Clubcontact clubc) {
		// TODO Auto-generated method stub
		clubcontactDAO.delete(clubc);
		return true;
	}
	
	@Override
	public List<Club> listClubsActByUserId(int userid) {
		// TODO Auto-generated method stub
		return this.listClubsActByUserId(userid+"");
	}

	@Override
	public List<Club> listClubsActByUserId(String userid) {
		// TODO Auto-generated method stub
		List<Clubcontact> list = clubcontactDAO.findByUserIdActivite(userid);
		ArrayList<Club> listreturn = new ArrayList<Club>();
		if(list != null && list.size() > 0 ){
			for(int i = 0;i<list.size();i++){
				Club temp = clubDAO.findById(list.get(i).getClubid());
				temp.setChrageUser(userinfoDAO.findById(temp.getChrageid()));
				listreturn.add(temp);
			}
			return listreturn;
		}
		else{
			return null;
		}
	}

	@Override
	public List<Club> listClubsNotActByUserId(int userid) {
		// TODO Auto-generated method stub
		return this.listClubsNotActByUserId(userid+"");
	}

	@Override
	public List<Club> listClubsNotActByUserId(String userid) {
		// TODO Auto-generated method stub
		List<Clubcontact> list = clubcontactDAO.findByUserIdNotActivite(userid);
		ArrayList<Club> listreturn = new ArrayList<Club>();
		if(list != null && list.size() > 0 ){
			for(int i = 0;i<list.size();i++){
				Club temp = clubDAO.findById(list.get(i).getClubid());
				temp.setChrageUser(userinfoDAO.findById(temp.getChrageid()));
				listreturn.add(temp);
			}
			return listreturn;
		}
		else{
			return null;
		}
	}

	@Override
	public Clubcontact findByUserIdAndClubId(String userid, String clubid) {
		// TODO Auto-generated method stub
		List<Clubcontact> list = clubcontactDAO.findByClubidAndUid(clubid, userid);
		if(list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}




	
}
