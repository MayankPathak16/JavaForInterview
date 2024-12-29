package java8InterviewQues.java8Concepts;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int digit = 123456;
        //Changed integer to String
        //Then split
        //Then collecting and finally using summingInt -> to sum the digits
        Integer sumOfdigits = Stream.of(String.valueOf(digit).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfdigits);
    }
}
