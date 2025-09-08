// package Basic.DailyTask;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day3Practice {
    public static void main(String[] args) {
        String str = "hello";
        // System.out.println(reverse2(str));

        String str1 = "Naman";
        // System.out.println(isPalindrome(str1));

        String str2 = "aabccde";
        // System.out.println(countFreq(str2));

        String str3 = "xaaeemo";
        System.out.println(firstNonRepeatChar1("hello"));
    }

    // Problem 1: Reverse a String
    static String reverse1(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i); // create string obj at each iteration bcz string is immutable so
                                                       // use String Builder
        }
        return reversedStr;
    }

    static String reverse2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Problem 2: Check if a String is Palindrome
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // Problem 3: Count Frequency of Each Character
    // "aabccde"
    static Map<Character, Integer> countFreq(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    // Problem 4: Find First Non-Repeating Character
    // "aabbccddef"
    // Using Map.Entry so switch from HashMap to LinkedHashMap
    static char firstNonRepeatChar(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; // sentinel if no non-repeating char
    }

    // with HashMap + without Map.Entry.
    static char firstNonRepeatChar1(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (freqMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0'; // or any other sentinel value to indicate no non-repeating char
    }
}
