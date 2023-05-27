package assignmentStrings;

public class reversestringwithpreservingthespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hii i am sabir Mulla";
char b[]=s.toCharArray();
char n []=new char [b.length];
for (int i =0;i<b.length;i++) {
	if (b[i]==' ') {
		n[i]=' ';	
	}	
}
int j =n.length-1;
for (int i =0;i<b.length;i++) {
	if(b[i]!=' ') {
		if(n[j]==' ') {
			j--;
		}
		n[j]=b[i];
		j--;
	}
	
	
}System.out.println(String.valueOf(n));

	}

}
