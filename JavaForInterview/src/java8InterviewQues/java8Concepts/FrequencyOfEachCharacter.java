package java8InterviewQues.java8Concepts;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args){
        String inputString = "Java Concept Of The Day";
        //Change into character and later mapped into the object
        Map<Character,Long> charCountMap = inputString.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCountMap);

    }
}
