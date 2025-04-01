/*
 * To findlongest substring length which doesnot contain -
 * repeating characters in given string
 * input :: abbac
 * output :: bac --> length is 3
 
 *  input :: abcabcbb
 * output :: abc --> length is 3
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _25LongestSubstrWoRepeatChar {
    public static void main(String[] args) {
        lengthOfLongestSubstring("cabcabcbb");
        lengthOfLongestSubstring2("cabcabcbb");
    }

    private static void lengthOfLongestSubstring(String s) {
        String LongestSubstring = "";
        int LongestSubstringLength = 0;

        Map<Character, Integer> maps = new LinkedHashMap<>();
        char[] chArr = s.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            char ch = chArr[i];
            if (!maps.containsKey(ch)) {
                maps.put(ch, i); // a-0 b-1
            } else {
                i = maps.get(ch);
                maps.clear();
            }
            if (maps.size() > LongestSubstringLength) {
                LongestSubstringLength = maps.size();
                LongestSubstring = maps.keySet().toString();
            }
        }

        System.out.println("The longest substring is: " + LongestSubstring);
        System.out.println("The longest substring Length is: " + LongestSubstringLength);
    }
    /*
     * Problems in Your Code
     * 
     * Using keySet().toString() is incorrect for extracting substrings, as it gives
     * something like [a, b, c] instead of a proper string.
     * Inefficient Resetting: Every time a duplicate character is found, the loop
     * jumps back to that duplicate's index and starts over. This is inefficient.
     */

    /*
     * Better Approach Using Sliding Window
     * A more efficient way is the Sliding Window + HashMap technique:
     * Why This Works Better?
     * 
     * ✅ Uses a sliding window to efficiently track unique characters.
     * ✅ No need to restart from duplicate index.
     * ✅ Extracts the actual substring instead of using keySet().
     * ✅ Runs in O(n) time complexity, much faster.
     */
    private static int lengthOfLongestSubstring2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;
        String longestSubstring = "";

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1); // Move left pointer to avoid duplicate
            }
            map.put(ch, right); // Update the latest index
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longestSubstring = s.substring(left, right + 1);
            }
        }

        System.out.println("Longest Substring: " + longestSubstring);
        return maxLength;
    }

}
