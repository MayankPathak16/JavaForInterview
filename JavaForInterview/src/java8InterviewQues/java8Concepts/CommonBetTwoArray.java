package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.List;

public class CommonBetTwoArray {
    public static void main(String[] args){
        List<Integer> intList1 = Arrays.asList(12,23,34,45,56,67,78,89);
        List<Integer> intList2 = Arrays.asList(13,35,57,79,23,34,45,56);
        intList1.stream().filter(intList2::contains).forEach(System.out::println);

    }
}
