package test;


import java.sql.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.UserinfoDAO;
import service.ClubService;
import service.RegisterService;
import service.UserinfoService;
import table.Club;
import table.Userinfo;



public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//t.testUserinfoDAO();
		t.testClubDAO();
	}

	public ClassPathXmlApplicationContext getBeanFactory(){
		String xml = "applicationContext.xml";
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
		return ac;
	}
	
	public void testUserinfoDAO() {
		ClassPathXmlApplicationContext ac = getBeanFactory();
		UserinfoService userinfoService = (UserinfoService) ac.getBean("userinfoService");
		List list = userinfoService.findAllUser();
		System.out.println("测试:userinfoDAO.findAll()");
		if(list != null && list.size() > 0){
			System.out.println("查到了用户!");
			for(int i=0;i<list.size();i++){
				Userinfo user = (Userinfo) list.get(i);
				System.out.println("user.getId()="+user.getId());
				System.out.println("user.getUsername()="+user.getUsername());
			}
		}
		else{
			System.out.println("未查到用户!");
		}
		System.out.println("_______________________");
		
		
		System.out.println("测试:userinfoDAO.findById()");
		Userinfo user = userinfoService.findUserById("1008");
		if(user != null){
			System.out.println("user.getId()="+user.getId());
			System.out.println("user.getUsername()="+user.getUsername());
		}
		else{
			System.out.println("未查到用户!");
		}
		System.out.println("_______________________");
		
		System.out.println("测试:userinfoService.deleteOneUser(String usnerid)");
		if(userinfoService.deleteOneUser("1008")){
			System.out.println("删除用户!");
		}
		else{
			System.out.println("未删除用户!");
		}
		System.out.println("_______________________");
		
		
	}
	
	public void testClubDAO() {
		ClassPathXmlApplicationContext ac = getBeanFactory();
		ClubService clubService = (ClubService) ac.getBean("clubService");
		
		System.out.println("测试: clubService.addClub(club);");
		Club club = new Club();
		club.setChrageid(1000);
		club.setClubname("测试club");
		club.setSetuptime(new Date(System.currentTimeMillis()));
		club.setComment("测试");
		club.setContent("测试测试");
		club.setFlag(false);
		clubService.addClub(club);
		System.out.println("_______________________");
		
		
		List<Club> list = clubService.listAllClub();
		System.out.println("测试: clubService.listAllClub()");
		if(list != null && list.size() > 0){
			System.out.println("查到了社团!");
			for(int i=0;i<list.size();i++){
				Club user = (Club) list.get(i);
				System.out.println("user.getId()="+user.getId());
				System.out.println("user.getClubname()="+user.getClubname());
				System.out.println("user.getFlag()="+user.getFlag());
			}
		}
		else{
			System.out.println("未查到社团!");
		}
		System.out.println("_______________________");
		
		list = clubService.listAllClubActivated();
		System.out.println("测试: clubService.listAllClubActivated()");
		if(list != null && list.size() > 0){
			System.out.println("查到了社团!");
			for(int i=0;i<list.size();i++){
				Club user = (Club) list.get(i);
				System.out.println("user.getId()="+user.getId());
				System.out.println("user.getClubname()="+user.getClubname());
				System.out.println("user.getFlag()="+user.getFlag());
			}
		}
		else{
			System.out.println("未查到社团!");
		}
		System.out.println("_______________________");
		
		System.out.println("测试:clubService.getClubById()");
		Club user = clubService.getClubById("1000");
		if(user != null){
			System.out.println("user.getId()="+user.getId());
			System.out.println("user.getClubname()="+user.getClubname());
			System.out.println("user.getFlag()="+user.getFlag());
		}
		else{
			System.out.println("未查到社团!");
		}
		System.out.println("_______________________");
		
		System.out.println("测试:clubService.deleteClub(String clubid)");
		if(clubService.deleteClub(club.getId()+"")){
			System.out.println("删除用户!");
		}
		else{
			System.out.println("未删除用户!");
		}
		System.out.println("_______________________");
		
		
	}
	

}
