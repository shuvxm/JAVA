// package Basic.DailyTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Day5Practice {
    public static void main(String[] args) {

        int[] arr = { 5, 2, 9, 1, 5, 6 };
        System.out.println(sortArray(arr));

        sortArray1(arr, true);
        sortArray1(arr, false);

        int[] arr2 = { 4, 4, 1, 2 };
        int sum = 5;
        System.out.println(havePairSum(arr2, sum));
        Arrays.sort(arr2); // before use 2 pointer technique first sort array
        System.out.println(havePairSum1(arr2, sum));

        int[] arr3 = { 1, 2, 3, 4, 5 };
        printPairwithSum(arr3, sum);

        int[] arr4 = { -10, -3, 1, 2, 5, 6 };
        pairWithMaxProduct(arr4);

    }

    /*
     * Problem 1: Sort an Array in Ascending and Descending
     * Input: arr = [5, 2, 9, 1, 5, 6]
     * Output (Ascending): 1 2 5 5 6 9
     * Output (Descending): 9 6 5 5 2 1
     */
    static List<Integer> sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // swap arr[i] & arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // convert sorted array to a list
        List<Integer> list = new ArrayList<>();
        for (int elem : arr) {
            list.add(elem);
        }
        return list;
    }

    static void sortArray1(int[] arr, boolean ascending) {
        Arrays.sort(arr);
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            list.add(i);
        }
        // if descending order is needed, reverse the list
        if (!ascending) {
            Collections.reverse(list);
        }
        System.out.println(list);
    }

    /*
     * Problem 2: Check if Array has a Pair with Given Sum (Two Pointer)
     * Input: arr = [1, 2, 4, 4], sum = 8
     * Output: true (because 4+4=8)
     */
    // Brute-force method
    static boolean havePairSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    // to use Two-pointer method , first we have to sort the array then use 2
    // pointer, it will be more beneficial
    static boolean havePairSum1(int[] arr, int sum) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            // if (arr[i] + arr[j] == sum) {
            // return true;
            // }
            // i++;
            // j--; // incorrect way to use 2 pointer
            int currentSum = arr[i] + arr[j];
            if (currentSum == sum)
                return true;
            else if (currentSum < sum)
                i++;
            else
                j--;
        }
        return false;
    }

    /*
     * Problem 3: Find All Pairs in Sorted Array with Given Sum
     * Input: arr = [1, 2, 3, 4, 5], sum = 6
     * Output: (1, 5) , (2, 4)
     */
    static void printPairwithSum(int[] arr, int sum) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int currentSum = arr[i] + arr[j];
            if (currentSum == sum) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                i++;
                j--;
            } else if (currentSum < sum)
                i++;
            else
                j--;
        }
    }

    /*
     * Problem 4:Find Pair with Maximum Product
     * Input: arr = [-10, -3, 1, 2, 5, 6]
     * Output: (-10, -3) → product = 30
     * OR
     * (5, 6) → product = 30
     */
    static void pairWithMaxProduct(int[] arr) {
        // Arrays.sort(arr); // []
        // int i = 0;
        // int j = arr.length - 1;
        // int maxProduct = 1;
        // while (i < j) {
        // int currProduct = arr[i] * arr[j];
        // if (maxProduct < currProduct) {
        // maxProduct = currProduct;
        // }
        // i++;
        // j--;
        // }
        // System.out.println(maxProduct); // wrong approach with 2 pointer
        if (arr.length < 2) {
            System.out.println("Not enough elements");
            return;
        }
        Arrays.sort(arr);
        int n = arr.length;
        int product1 = arr[0] * arr[1]; // two smallest numbers
        int product2 = arr[n - 1] * arr[n - 2]; // two largest numbers

        if (product1 > product2) {
            System.out.println("Pair: (" + arr[0] + ", " + arr[1] + ") -> Product = " + product1);
        } else {
            System.out.println("Pair: (" + arr[n - 2] + ", " + arr[n - 1] + ") -> Product = " + product2);
        }
    }

}
