
import java.util.HashMap;
import java.util.Map;

public class Day6Practice {
    public static void main(String[] args) {
        String str = "hello";
        reverseString(str);
        reverseString2(str);

        String str2 = "madam";
        checkPlaindrome(str2);
        checkPlaindrome(str);

        String str3 = "aeioubc@d"; // ignoring special characters
        countVowelConsonant(str3);

        String str4 = " I am a Java Developer ";
        removeSpaces(str4);

        String str5 = "I am a Java developppers learning string manipulation";
        findLongestWord(str5);

        String str6 = "success";
        countFrequency(str6);

        findNonRepeat("swiss"); // Output: w

    }

    static void reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
    }

    static void reverseString2(String str) {
        // String reversed = "";
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        // System.out.println(sb.toString());
        System.out.println(sb);
    }

    static void checkPlaindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }

    /*
     * Problem C: Count Vowels and Consonants
     * Input: "hello world"
     * Output:
     * Vowels: 3, Consonants: 7
     * Ignore spaces and special characters.
     */
    static void countVowelConsonant(String str) {
        int countVowel = 0, countConsonant = 0;
        str = str.toLowerCase();
        System.out.println(str.toUpperCase());

        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) { // ignore special chars
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    countVowel++;
                } else {
                    countConsonant++;
                }
            }
        }
        System.out.println("vowel: " + countVowel + " || consonant: " + countConsonant);
    }

    /*
     * Remove All White Spaces
     * Input: " I am a Java Developer "
     * Output: "Iam aJavaDeveloper"
     */
    static void removeSpaces(String str) {
        // str = str.trim(); // trim() is used to remove starting and ending spaces
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }

    // Day 7
    /*
     * Problem A: Longest Word in a Sentence
     * Input: "I am a Java developer learning string manipulation"
     * Output: manipulation
     * 
     * Find the longest word in the string. If multiple, return the first longest.
     */
    static void findLongestWord(String str) {
        String[] words = str.split(" ");
        String longestWOrd = "";
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWOrd = word;
            }
        }
        System.out.println("Longest word is: " + longestWOrd);
    }

    /*
     * Problem B: Count Character Frequency
     * Input: "success"
     */
    static void countFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    /*
     * Problem C: First Non-Repeating Character
     * Input: "swiss"
     * Output: w
     */
    static void findNonRepeat(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // for (char c : str.toCharArray()) {
        // if (map.get(c) == 1) {
        // System.out.println("First non-repeating character: " + c);
        // return;
        // }
        // }
        // Iterate map (in insertion order) — no need to loop string again
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");

    }
}
