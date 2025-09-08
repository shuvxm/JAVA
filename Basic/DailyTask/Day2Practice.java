// package Basic.DailyTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day2Practice {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 2, 4, 3, 5, 2 };
        // countFrequencyBFA(arr1);
        System.out.println(countFrequency(arr1));

        int[] arr2 = { 4, 3, 2, 3, 2, 4, 10 };
        System.out.println(elementAppearOnce(arr2));

        int[] arr3 = { 1, 2, 3, 4, 5, 2 };
        System.out.println(duplicateElement(arr3));

        System.out.println(getDuplicate(arr2));
    }

    /*
     * Input : arr = [2, 3, 2, 4, 3, 5, 2]
     * Output:-
     * 2 → 3 times
     * 3 → 2 times
     * 4 → 1 time
     * 5 → 1 time
     * 
     */
    // BFA - Brute Force Approach , TC: O(n^2)
    static void countFrequencyBFA(int[] arr) {
        int[] freq = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
                if (freq[i] != visited) {
                    freq[i] = count;
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println("Element | frequency");
                System.out.println(arr[i] + " | " + freq[i]);
            }
        }
    }

    // Efficient - TC : O(n)
    static Map<Integer, Integer> countFrequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        // for (int i : arr) {
        // map.put(i, map.getOrDefault(i, 0) + 1);
        // }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1); // Hey map, can you give me the value associated with the key
                                                      // arr[i]?
            } else {
                map.put(arr[i], 1); // first time element can be seen in map then frequency will assign to 1
            }
        }
        return map;
    }

    // Problem 2
    static int elementAppearOnce(int[] arr) {
        int result = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        // 1st pass: build frequency map
        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
        // 2nd pass: collect elements with frequency 1
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    // Problem 3: return true if duplicate exist
    static boolean duplicateElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                return true; // duplicate found
            }
            set.add(i);
        }
        return false;
    }

    // Problem 4: Print all elements that appear more than once
    static List<Integer> getDuplicate(int[] arr) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i : arr) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() != 1) {
                resultList.add(entry.getKey());
            }
        }
        return resultList;
    }
}
