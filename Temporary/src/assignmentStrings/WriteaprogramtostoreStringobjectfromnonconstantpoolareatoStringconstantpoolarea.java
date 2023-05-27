package assignmentStrings;

public class WriteaprogramtostoreStringobjectfromnonconstantpoolareatoStringconstantpoolarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="java";

String s2="python";
String s3=new String("java").intern();
String s4=new String("python");

System.out.println(s==s3);
	}

}
