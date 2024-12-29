package java8InterviewQues.java8Concepts;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {
    public static void main(String[] args){
        String item1 = "RaceCar";
        String item2 = "CarRace";
        //joining to join the character again
        item1 = Stream.of(item1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        item2 = Stream.of(item2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(item1.equals(item2)){
            System.out.println("Both Strings are anagram");
        }else{
            System.out.println("Both Strings are not anagram");
        }
    }
}
