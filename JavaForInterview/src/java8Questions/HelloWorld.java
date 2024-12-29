package java8Questions;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class HelloWorld {
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5,2,5,6,1,2};
 	Map<Integer,Long> countMap = Arrays.stream(array).boxed().
 collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 
 	 countMap.forEach((number,count)-> System.out.println(number+" occurs"+count+" times"));
 

 
}
}