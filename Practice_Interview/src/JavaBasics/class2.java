package JavaBasics;

public class class2 {

 
		public static void main(String[] args){
	
		String sentence = "Java Interview Questions";
		String reversedSentence = reverseSentence(sentence); 
		System.out.println(reversedSentence);
		}
		public static String reverseSentence(String sentence){ 
			String reverse = "";
		String[] words = sentence.split("\\s");
		int [] a= {12,47,56};
		
		for(int i=words.length-1;i>=0;i--){
			reverse = reverse + words[i] + " ";
		}
		return reverse;
		}
		}
