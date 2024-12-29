package intellectDesignArena;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 15.	Reverse the string provided in the given list and then sort the list
 * in ascending order and then return the list to the caller:
 * public List<String>reverseStringAndSort(List<String>strList) {
 * }
 *
 * e.g. If the caller sends the following list:
 * nml
 * cba
 * zyx
 * Then the code should return:
 * abc
 * lmn
 * xyz
 */
public class ideC {
    public  List<String>reverseStringAndSort(List<String> strList){
        for(int i = 0;i<strList.size();i++){
            String reverseStr = new StringBuilder(strList.get(i)).reverse().toString();
            strList.set(i,reverseStr);

        }
        Collections.sort(strList);
        return strList;
    }
    public static void main(String[] args){
    ideC  idc = new ideC();
        List<String> inputList = Arrays.asList("nml", "cba", "zyx");
        List<String> result = idc.reverseStringAndSort(inputList);
        System.out.println(result);
    }
}
