package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimalRevereOrder {
    public static void main(String[] args){
        List<Double> decimalList = Arrays.asList(12.23,23.34,45.56,67.78,78.89);
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
