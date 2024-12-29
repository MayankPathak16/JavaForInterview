package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.List;

public class SumAndAverageOfElements {
    public static void main(String[] args){
       /* List<Integer> intList = Arrays.asList(12,23,34,45,56,67,78,89);
        //Need to find the sum and average of elements
        //sum of elements*/
        //Defining the Array
        int[] intArray = new int[]{12,23,34,45,56,67,78,89};
        int sum = Arrays.stream(intArray).sum();
        System.out.println("Sum of elements = "+ sum);
        double avg = Arrays.stream(intArray).average().getAsDouble();
        System.out.println("Average of elements = "+ avg);


    }
}
