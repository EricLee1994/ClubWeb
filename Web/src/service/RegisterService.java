package service;

import java.util.List;

import comm.StrToInt;

import table.Userinfo;
import dao.UserinfoDAO;
import iservice.IRegisterService;

public class RegisterService implements IRegisterService{
	private UserinfoDAO userinfoDAO;
	
	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}

	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}

	@Override
	public Userinfo addUser(Userinfo user) {
		// TODO Auto-generated method stub
		userinfoDAO.save(user);
		return user;
	}

	@Override
	public boolean isExistUser(String usnername) {
		// TODO Auto-generated method stub
		if(userinfoDAO.findByUsername(usnername) != null && userinfoDAO.findByUsername(usnername).size() > 0){
			System.out.println("userinfoDAO.findByUsername(usnername).get(0).getId()="+userinfoDAO.findByUsername(usnername).get(0).getId());
			System.out.println("userinfoDAO.findByUsername(usnername).get(0).getUsername()="+userinfoDAO.findByUsername(usnername).get(0).getUsername());
			return true;
		}
		else
			return false;
	}

	
}
