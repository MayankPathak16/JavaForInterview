package dsa;

public class TwoSumProblem {
    //Method: 01 O(n2) because We are using two nested loops
    //Auxiliary space: 0(1)
    static boolean twoSum(int[] arr, int target) {
        //defining the length of array
        int n = arr.length;
        //Iterate through each element in array
        for (int i = 0; i < n; i++) {
            //checking the element which comes after it
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }

        }
        return false;
    }
    //Method: 02


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(twoSum(arr, target));

    }
}
