package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(12,23,34,98,87,76,65,54);
        //Find minimum and maximum from the List of integers
        //find max number from list
        int maxNumber = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max number from the list:"+maxNumber);
        //find minimum from the list
        int minNumber = integerList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("min number from list:"+minNumber);

    }
}
