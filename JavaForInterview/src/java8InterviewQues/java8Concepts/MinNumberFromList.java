package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MinNumberFromList {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(23, 54, 78, 12, 98);
        Iterator<Integer> itrList = numberList.iterator();
        while(itrList.hasNext()){
            int num = itrList.next();
            System.out.println(num);
        }
        int minNumber = numberList.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
        System.out.println(minNumber);
    }
}
