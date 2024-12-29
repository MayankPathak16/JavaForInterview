package java8InterviewQues.java8Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingNegativeFromArray {
   /* static void removeInt(int[] arr){
        List<Integer> newArr = new ArrayList<>();
        for(int x : arr){
            if(x>=0){
                newArr.add(x);
            }
        }
        for(int x: newArr){
            System.out.println(x+" ");
        }

    }
    public static void main(String[] args){
        int [] givenArr = new int[]{2,7,-5,3,-4};
        removeInt(givenArr);
    }*/
    //Using java 8
   public static void main(String[] args){
      int [] givenArr = new int[]{2,7,-5,3,-4};
      int[] positiveNumbers = Arrays.stream(givenArr).filter(x->x>=0).toArray();
      System.out.println(Arrays.toString(positiveNumbers));
   }



}
