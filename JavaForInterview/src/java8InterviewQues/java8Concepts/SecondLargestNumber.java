package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {
    public static void main(String[] args){
        List<Integer> listOfInt = Arrays.asList(12,23,34,45,56,67,78,89);
       System.out.println(listOfInt.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
