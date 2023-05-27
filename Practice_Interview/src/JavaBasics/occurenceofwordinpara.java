package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class occurenceofwordinpara {
	public static void frequencyWords(String strInput) {
		Map<String, Integer> occurrences = new HashMap<String, Integer>();
		String[] words = strInput.split("\\s+");
		for (String word : words) {
			if (occurrences.containsKey(word)) {
				int count = occurrences.get(word);
				occurrences.put(word, count + 1);
			} else {
				occurrences.put(word, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
	}
	public static void main(String args[]) {
		frequencyWords("hii very good good morning to to you you you all all all all all all all all all all all all all");
}
}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	