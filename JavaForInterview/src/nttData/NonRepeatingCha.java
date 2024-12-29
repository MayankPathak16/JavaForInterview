package nttData;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCha {
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
                System.out.println(entry.getKey());
            }
        }
    }
}
