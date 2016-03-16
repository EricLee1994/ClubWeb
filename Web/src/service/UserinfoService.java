package service;

import java.util.List;

import comm.StrToInt;

import dao.UserinfoDAO;

import table.Userinfo;
import iservice.IUserinfoService;

public class UserinfoService implements IUserinfoService {
	private UserinfoDAO userinfoDAO;
	
	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}

	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}

	@Override
	public List<Userinfo> findAllUser() {
		// TODO Auto-generated method stub
		return userinfoDAO.findAll();
	}
	
	@Override
	public Userinfo findUserById(int userid) {
		// TODO Auto-generated method stub
		return userinfoDAO.findById(userid);
	}
	
	@Override
	public Userinfo findUserById(String userid) {
		// TODO Auto-generated method stub
		return userinfoDAO.findById(StrToInt.strToInt(userid));
	}

	@Override
	public boolean deleteOneUser(String usnerid) {
		// TODO Auto-generated method stub
		if(userinfoDAO.findById(StrToInt.strToInt(usnerid)) != null){
			userinfoDAO.delete(userinfoDAO.findById(StrToInt.strToInt(usnerid)));
			return true;
		}
		return false;
	}



}
