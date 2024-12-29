package java8Employee;

import java.util.Arrays;
import java.util.Scanner;

public class Coditas {

	//ARR = EAT,TAN,ATE,BAT,NAT
	
	public static boolean isAnagram(char[]first , char[]second) {
		if(first.length != second.length) {
			return false;
		}
		for(int i=0;i<first.length;i++) {
			if(first[i]!=second[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first String");
		String firstString  = sc.nextLine();
		
		System.out.println("Enter Second String");
		String secondString  = sc.nextLine();
		
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		
		char[] firstArray = firstString.toCharArray();
		char[] secondArray = secondString.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		if(isAnagram(firstArray,secondArray)) {
			System.out.println("Two Strings are Anagram");
		}else {
			System.out.println("Two Strings are not Anagram");
		}
		
		
		
	}
	
}
