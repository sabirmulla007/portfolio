package assignmentStrings;

public class $Percentageofuppercaselowercasedigits_andspecialcharactersinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hiii  i Am sabir mulla";

int totalchar=0;
int uppercase=0;
int lowercase=0;
int digit=0;
char b[]=s.toCharArray();
for(int i=0;i<s.length();i++) {
if(Character.isUpperCase(b[i])) {
	uppercase++;
	
	
}if(Character.isLowerCase(b[i])) {
	lowercase++;
	
	}if(Character.isDigit(b[i])) {
		digit++;
}
	

}
System.out.println(uppercase+"\n"+lowercase+"\n"+digit);}}
