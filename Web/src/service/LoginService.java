package service;

import java.util.List;
import table.Userinfo;
import dao.UserinfoDAO;
import iservice.ILoginService;

public class LoginService implements ILoginService{
	private UserinfoDAO userinfoDAO;
	
	public UserinfoDAO getUserinfoDAO() {
		return userinfoDAO;
	}

	public void setUserinfoDAO(UserinfoDAO userinfoDAO) {
		this.userinfoDAO = userinfoDAO;
	}

	@Override
	public boolean isUser(String username, String password) {
		// TODO Auto-generated method stub
		if (username == null || "".equals(username) || password == null || "".equals(password)) {
			return false;
		}
		
		List<Userinfo> list = userinfoDAO.findByUsername(username);
		if (  list != null && list.size() > 0 && list.get(0).getPassword().equals(password)  ) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isAdmin(String username, String password) {
		// TODO Auto-generated method stub
		if(username != null && password != null && username.trim().equals("admin") && password.trim().equals("admin")){
			return true;
		}
		else
			return false;
	}

	@Override
	public Userinfo getUserInfo(String username) {
		// TODO Auto-generated method stub
		List<Userinfo> list = userinfoDAO.findByUsername(username);
		if (  list != null && list.size() > 0   ) {
			return list.get(0);
		}
		return null;
	}
	
}
