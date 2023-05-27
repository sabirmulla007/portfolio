package JavaBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class practice2 {

	public static void main(String[] args) {
		List m =new ArrayList();
		m.add("hshshhshs");
		m.add("hshshhshs");
	m.add("hshshhshs");
	m.add("a");
	m.add("a");
	m.add("b");
	
		System.out.println(findDuplicates( m));
	}
		public static Set<String> findDuplicates(List<String> listDuplicates) {
			 Set<String> set1 = new HashSet<String>(); 
			 Set<String> set2 = new HashSet<String>(); 
			for (String str : listDuplicates) {
			if (!set1.add(str)) { set2.add(str);
			}
			}
			return set2;
			}}