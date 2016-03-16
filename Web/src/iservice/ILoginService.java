package iservice;

import table.Userinfo;

public interface ILoginService {
	public boolean isUser(String username,String password);
	public boolean isAdmin(String username,String password);
	public Userinfo getUserInfo(String username);
}
