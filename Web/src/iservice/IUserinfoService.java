package iservice;

import java.util.List;
import table.Userinfo;

public interface IUserinfoService {
	public List<Userinfo> findAllUser();
	public Userinfo findUserById(String userid);
	public Userinfo findUserById(int userid);
	public boolean deleteOneUser(String userid);
}
