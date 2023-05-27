package assignmentStrings;

import java.util.HashMap;

public class FindingtheFirstRepeatedAndNoRepeatedCharacterinAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java";
		HashMap<Character, Integer> m =    new  HashMap<Character, Integer>();
char [] a=s.toCharArray();
for (char c:a) {
	if(m.containsKey(c)) {
		m.put(c,m.get(c)+1);
	}
	else {
		m.put(c, 1);
	}
	}
	for (char c :a) {
		if (m.get(c)==1) {
			System.out.println(c);
			break;
			
		}}
	for (char c :a) {
		if (m.get(c)>1) {
			System.out.println(c);
			break;
		
		
	}
}
	}

}
