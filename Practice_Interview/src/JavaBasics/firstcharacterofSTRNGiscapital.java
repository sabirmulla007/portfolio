package JavaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class firstcharacterofSTRNGiscapital {
	public static String changeToUpperCase(String str) {
		StringBuffer s = new StringBuffer();
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (ch == ' ' && str.charAt(i) != ' ')
				s.append(Character.toUpperCase(str.charAt(i)));
			else
				s.append(str.charAt(i));
			ch = str.charAt(i);
		}
		return s.toString().trim();
	}

	public static void main(String[] args) {
		System.out.println(changeToUpperCase("   jsjjsjaHHSsjsjaDJJJDJS"));
	}
}