package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args){
        //Remove duplicate elements from the list
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueString = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueString);
    }
}
