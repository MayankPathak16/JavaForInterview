package java8Questions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * write a progrma to print non repeted charector in a string
 
input :Java
 
output;JV
 
 * @author Mayank
 *
 */
public class QuesNttData {

	public static void main(String[] args) {
	
		String input = "mayank";
		printNonRepeatingChar(input);
		

	}
	public static void printNonRepeatingChar(String input) {
		Map<Character,Integer> charCountMap = new LinkedHashMap<>();
		
		for(char ch: input.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println((entry.getKey()).toUpperCase(0));
			}
		}
	}
}
