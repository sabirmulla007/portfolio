package JavaBasics;

import java.util.*;

public class revString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		List<Character> list = new ArrayList<Character>();

		for (int i = A.length() - 1; i >= 0; i--) {

			list.add(A.charAt(i));
		}
		char D[] = new char[list.size()];

		for (int i = 0; i < list.size(); i++) {

			D[i] = list.get(i);

		}
		String string=new String (D);

		if (string.trim().equals(A.trim())) {
			System.out.println("Yesdsdasds");
		} else {
			System.out.println(D.toString());
		}

	}
}