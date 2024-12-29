/**
 * 
 */
package java8Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Mayank
 *
 */
public class SeparateOddAndEvenNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(23,45,12,89,43,76,51,49,69,26,89,99);
Map<Boolean,List<Integer>> integerWrapper = listOfIntegers.stream().collect(Collectors.partitioningBy(x->x%2==0));

	}

}
