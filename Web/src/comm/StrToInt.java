package comm;

public class StrToInt {

	/**
	 * @param str
	 */
	public static int strToInt(String str) {
		// TODO Auto-generated method stub
        String num =str.replaceAll("\\D+", "");
        if(!num.equals("")){
        	return Integer.parseInt(num);
        }
        else{
        	return 0;
        }
        

	}
	
	public static void main(){
		System.out.println(strToInt("1001"));
	}
}
