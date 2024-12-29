package dsa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 2,2 occcurs 2 times
 * 4,4 occurs 2 times
 *
 */
public class CountDuplicateElement {
    public static void main(String[] args){
        //1,2,3,4,4,2,6
        //[4,4]
        //find 2nd largest
        List<Integer> elements = Arrays.asList(1,2,3,4,4,2,6);
        Optional secondLargest = elements.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if(secondLargest.isPresent()){
            System.out.println(secondLargest.get());
        }



    }



}
