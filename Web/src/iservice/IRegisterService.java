package iservice;

import table.Userinfo;

public interface IRegisterService {
	public Userinfo addUser(Userinfo user);				//注册一个学员
	public boolean isExistUser(String usnername);		//检测学员是否存在
}
