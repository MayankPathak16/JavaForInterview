package wissen;

import java.util.Arrays;

/**
 * Given a sorted array arr[] of size N, the task is to remove the duplicate elements from the array.
 *
 * Examples:
 *
 * Input: arr[] = {2, 2}
 * Output: arr[] = {2,null}
 * Explanation: All the elements are 2, So only keep one instance of 2.
 *
 * Input: arr[] = {1, 2, 2, 3, 4, 4 }
 * Output: arr[] = {1, 2, 3, 4,null,null}
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {2, 2};
        int[] arr2 = {1, 2, 2, 3, 4, 4};

        System.out.println("Input: " + Arrays.toString(arr1));
        removeDuplicates(arr1);
        System.out.println("Output: " + Arrays.toString(arr1) + "\n");

        System.out.println("Input: " + Arrays.toString(arr2));
        removeDuplicates(arr2);
        System.out.println("Output: " + Arrays.toString(arr2));
    }

    public static void removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int index = 0;  // To track unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            } else {
                arr[i] = Integer.parseInt(null);  // Temporarily mark duplicates with a unique value (like Integer.MIN_VALUE)
            }
        }

        // Replace Integer.MIN_VALUE with null (if we had access to a wrapper class array, we would use null directly)
        // Here we simulate "null" with a placeholder value like -1.
        for (int i = index + 1; i < arr.length; i++) {
            arr[i] = -1;  // Replace remaining positions with -1 to represent null.
        }
    }
}
