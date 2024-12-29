package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIncreasingOrderLength {
    public  static void main(String[] args){
        List<String> letterList = Arrays.asList("Mayank","Shubham","Shubhash","Kartikeya","Maximus","Albus","Annatar");
        //We have to sort the list based upon the Length of the String
        //We have to sort as per the length so used Comparator.comparing->String.length and then print each of the list
        letterList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
