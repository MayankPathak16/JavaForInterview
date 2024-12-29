package java8InterviewQues.java8Concepts;

import java.util.Arrays;
import java.util.List;

public class GetLastElementOfArray {
    public static void main(String[] args){
       List<String> listOfStrings = Arrays.asList("One","Two","Three","Four","Five","Six");
       /*We need to get the last element of String array
        here we have skipped ListOfStrings.size()-1 => 6-1=5 So 5 elements will get skipped.
        Whenever we have to print any element based on the index then we can use skip and findFirst
        We can use sorted or reverseOrder*/
       String lastElement = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
       System.out.println(lastElement); 


    }
}
