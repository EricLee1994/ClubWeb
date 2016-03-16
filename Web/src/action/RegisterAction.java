package action;

import iservice.IRegisterService;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import table.Userinfo;

public class RegisterAction {
	private IRegisterService registerService;
	private String username;
	private String password;
	private String name;
	private String school;
	private Integer age;
	private String class_;
	private String email;
	private String commont;

	public IRegisterService getRegisterService() {
		return registerService;
	}

	public void setRegisterService(IRegisterService registerService) {
		this.registerService = registerService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getClass_() {
		return class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCommont() {
		return commont;
	}

	public void setCommont(String commont) {
		this.commont = commont;
	}

	@SuppressWarnings("unchecked")
	public String execute() {
		ActionContext context = ActionContext.getContext();
		Map request = (Map) context.get("request");
		
		if(username == null || "".equals(username)){
			request.put("info", "用户名不能为空!");
			return "faile";
		}
		if(password == null || "".equals(password)){
			request.put("info", "密码不能为空!");
			return "faile";
		}
		if(name == null || "".equals(name)){
			request.put("info", "真实姓名不能为空!");
			return "faile";
		}
		if( registerService.isExistUser(username) ){
			request.put("info", "用户名已经注册!");
			return "faile";
		}
		Userinfo user = new Userinfo();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setSchool(school);
		user.setClass_(class_);
		user.setAge(age);
		user.setEmail(email);
		user.setCommont(commont);
		registerService.addUser(user);
		System.out.println("新注册用户：user.getId()="+user.getId());
		System.out.println("新注册用户：user.getName()="+user.getName());

		request.put("info", "注册成功!");
		request.put("url", "login.jsp");
		return "success";

	}

}
