package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMinAndMaxNumber {
    public static void main(String[] args){
        List<Integer> intList = Arrays.asList(12,98,23,87,34,76,45,56,91,48,29);
        //find min 3 and max 3 numbers from the list
        //minimum 3
        intList.stream().sorted().limit(3).forEach(System.out::println);
        //maximum 3
        intList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
