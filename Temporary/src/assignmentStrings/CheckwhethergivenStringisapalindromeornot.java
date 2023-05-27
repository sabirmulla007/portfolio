package assignmentStrings;
import java.lang.Throwable;
public class CheckwhethergivenStringisapalindromeornot {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		String s="hhhaaahhh";
		StringBuffer m=new StringBuffer(s);String p  = m.reverse().toString();
		
		
		
if (p.equals(s)) {
	System.out.println("palidrome");
	
	
}else 
	System.out.println("no palidrome");
	}

	
	}


