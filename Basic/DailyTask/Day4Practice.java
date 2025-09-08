// package Basic.DailyTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day4Practice {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        System.out.println("Missing Number from " + arr[0] + " to " + (arr.length + 1) + " is: " + missingNumber(arr));

        int[] arr2 = { 0, 1, 2, 2, 3, 4, 4, 5 };
        System.out.println(printUnique(arr2));

        int[] arr3 = { 1, 5, 7, -1, 5 };
        int[] arr4 = { 1, 1, 1, 5 };
        int sum = 6;
        System.out.println(countPairs(arr4, sum));

        List<int[]> result = printAllPairsWithSum(arr3, sum);
        for (int[] pair : result) {
            System.out.print(Arrays.toString(pair));
        }
    }

    /*
     * Problem 1: Find the Missing Number
     * Input: arr = [1, 2, 4, 5, 6]
     * Output: 3
     */
    static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        // System.out.println(expectedSum);
        // System.out.println(actualSum);
        return expectedSum - actualSum;
    }

    /*
     * Problem 2: Remove Duplicates and Print Unique Elements
     * Input: arr = [1, 2, 2, 3, 4, 4, 5]
     * Output: 1 2 3 4 5
     */
    /*
     * | Version | Time Complexity | Space Complexity |
     * | --------------------------------- | ------------------ | ------------------
     * |
     * | Return `Set` directly | O(n) | O(n) |
     * | Convert to `List` (new ArrayList) | O(n) + O(n) = O(n) | O(n) + O(n) = O(n)
     * |
     * 
     */
    // static Set<Integer> printUnique(int[] arr){
    static List<Integer> printUnique(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer i : arr) {
            set.add(i);
        }
        // return set;
        return new ArrayList<>(set);
    }

    /*
     * Problem 3: Count Pairs with Given Sum
     * Input: arr = [1, 5, 7, -1, 5], sum = 6
     * Output: 3
     * (→ Pairs: (1,5), (7,-1), (1,5 again))
     */
    static int countPairs(int[] arr, int sum) { // TC: O(n^2)
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    static int countPairs1(int[] arr, int sum) { // TC: O(n)
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int elem : arr) {
            int complement = sum - elem; // sum is 6 - (minus) elem of array, then complement will have remaining elem
                                         // to get match with sum
            if (freqMap.containsKey(complement)) {
                // count = count + freqMap.get(complement);
                count++;
            }
            freqMap.put(elem, freqMap.getOrDefault(elem, 0) + 1);
        }
        return count;
    }

    // Problem 4: Find All Pairs With Given Sum
    static List<int[]> printAllPairsWithSum(int[] arr, int sum) {

        List<int[]> pairSum = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int elem : arr) {
            int complement = sum - elem; // sum is 6 - (minus) elem of array, then complement will have remaining elem
                                         // to get match with sum
            if (freqMap.containsKey(complement)) {
                for (int i = 0; i < freqMap.get(complement); i++) {
                    pairSum.add(new int[] { complement, elem });
                }
            }
            freqMap.put(elem, freqMap.getOrDefault(elem, 0) + 1);
        }
        return pairSum;
    }

}
