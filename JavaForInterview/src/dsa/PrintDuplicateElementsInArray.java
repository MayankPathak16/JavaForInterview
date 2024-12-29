package dsa;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicateElementsInArray {
    //Method 1: Brute Force Method
    private static void findDuplicateUsingBruteForce(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    System.out.println("Duplicate Array:" + inputArray[i]);
                }
            }
        }
    }

    //Method 2 Sorting method
    public static void findDuplicateUsingSorting(int[] inputArray) {
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i+1]) {
                System.out.println("Duplicate Array:" + inputArray[i]);
            }
        }
    }
    //Method 3: Using hashset
    public static void findDuplicateUsingHashSet(int[] inputArray){
        //Creating a hashset
        HashSet<Integer> duplicateArr = new HashSet<>();
        for(int element : inputArray){
            if(!duplicateArr.add(element)){
                System.out.println("Duplicate Element :"+element);
            }
        }

    }
    //Method 4: Using Hashmap
    public static void findDuplicateUsingHashMap(int[] inputArray){
        HashMap<Integer,Integer> duplicateArr = new HashMap<>();
        for(int element: inputArray){
            if(duplicateArr.get(element) == null){
                duplicateArr.put(element,1);
            }else{
                duplicateArr.put(element,duplicateArr.get(element)+1);
            }
        }
        Set<Map.Entry<Integer,Integer>> set = duplicateArr.entrySet();
        {
            for(Map.Entry<Integer,Integer> entry : set){
                if(entry.getValue()>1){
                    System.out.println("Duplicate element "+ entry.getKey()+" -found "+entry.getValue()+" times");
                }
            }

        }
    }
    //Method 5
    public static void findDuplicateUsingJava8(int[] arr){
        //creating a set which will not allow duplicate elements
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = Arrays.stream(arr).filter(i->!set.add(i)).boxed().collect(Collectors.toSet());
        System.out.println(duplicateElements);
    }
    public static void main(String[] args) {
        int[] checkDuplicateArray = new int[]{12, 23, 34, 45, 12, 23, 56, 67, 56};
        findDuplicateUsingBruteForce(checkDuplicateArray);
        findDuplicateUsingSorting(checkDuplicateArray);
        findDuplicateUsingHashSet(checkDuplicateArray);
        findDuplicateUsingHashMap(checkDuplicateArray);
        findDuplicateUsingJava8(checkDuplicateArray);

    }
}
