package java8InterviewQues.java8Concepts;

import java.util.*;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumbers {
    public static void main(String[] args){
        List<Integer> listOfIntegers = Arrays.asList(12,23,34,45,56,67,78,89,98,87,76,65,54,43,32,21);
        Map<Boolean,List<Integer>> checkOddEvenWrapper = listOfIntegers.stream().collect(Collectors.partitioningBy(x->x%2==0));
        Set<Map.Entry<Boolean,List<Integer>>> checkOddEven = checkOddEvenWrapper.entrySet();
        for(Map.Entry<Boolean,List<Integer>> entrySet : checkOddEven){
            if(entrySet.getKey()){
                System.out.println("EvenNumbers");
            }else{
                System.out.println("Odd Numbers");
            }
            List<Integer> list = entrySet.getValue();
            for(int i : list){
                System.out.println(i);
            }
        }
    }
}
