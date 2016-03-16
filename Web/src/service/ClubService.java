package service;

import java.util.List;

import comm.StrToInt;

import dao.ClubDAO;
import dao.UserinfoDAO;

import table.Club;
import iservice.IClubService;

public class ClubService implements IClubService {
	ClubDAO clubDAO;
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

	@Override
	public void addClub(Club club) {
		// TODO Auto-generated method stub
		clubDAO.save(club);
	}

	@Override
	public boolean isExistClub(String clubname) {
		// TODO Auto-generated method stub
		if(clubDAO.findByClubname(clubname) != null && clubDAO.findByClubname(clubname).size()>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Club> listAllClub() {
		// TODO Auto-generated method stub
		return clubDAO.findAll();
	}
	
	public List<Club> setClubsChrageUser(List<Club> list){
		if(list != null && list.size() > 0){
			for(int i = 0;i<list.size();i++){
				list.get(i).setChrageUser(userinfoDAO.findById(list.get(i).getChrageid()));
			}
			//return list;
		}
		return list;
	}
	@Override
	public List<Club> listAllClubActivated() {
		// TODO Auto-generated method stub
		return this.setClubsChrageUser(clubDAO.listAllClubActivated());
	}

	@Override
	public Club getClubById(String clubid) {
		// TODO Auto-generated method stub
		Club club = clubDAO.findById(StrToInt.strToInt(clubid));
		club.setChrageUser(userinfoDAO.findById(club.getChrageid()));
		return club;
	}

	@Override
	public Club setClubActivate(String clubid) {
		// TODO Auto-generated method stub
		Club club = clubDAO.findById(StrToInt.strToInt(clubid));
		if(club == null)
			return null;
		else{
			club.setFlag(true);
			return club;
		}
	}

	@Override
	public boolean deleteClub(String clubid) {
		// TODO Auto-generated method stub
		if(clubDAO.findById(StrToInt.strToInt(clubid)) != null){
			clubDAO.delete(clubDAO.findById(StrToInt.strToInt(clubid)));
			return true;
		}
		return false;
	}

	@Override
	public Club changeClub(Club club) {
		// TODO Auto-generated method stub
		clubDAO.attachDirty(club);
		return club;
	}

	@Override
	public boolean isExistClub(int usnerid) {
		// TODO Auto-generated method stub
		if(clubDAO.findByChrageid(usnerid) != null && clubDAO.findByChrageid(usnerid).size()>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Club> listClubByChrageId(int chrageid) {
		// TODO Auto-generated method stub
		return clubDAO.findByChrageid(chrageid);
	}

	@Override
	public Club findById(String id) {
		// TODO Auto-generated method stub
		return clubDAO.findById(StrToInt.strToInt(id));
	}

}
