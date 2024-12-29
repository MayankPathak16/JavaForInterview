package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray {
    public static void main(String[] args){
        //merge two unsorted array into single sorted array
        int[] a = new int[]{12,76,34,91,29,32};
        int[] b = new int[]{23,98,45,21,82,71};
        int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        //for removing duplicate use distinct() after sorted
        System.out.println(Arrays.toString(c));
    }
}
