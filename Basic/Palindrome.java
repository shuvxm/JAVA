package Basic;

public class Palindrome {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(isPalindrome(n)); // O(log₁₀n)

        String str = "Naman";
        System.out.println(checkPalindromeString(str));
    }

    static boolean isPalindrome(int n) {
        if (reverse(n) == n) {
            return true;
        }
        return false;
    }

    static int reverse(int n) {
        int reverseDigit = 0;
        while (n != 0) {
            reverseDigit = reverseDigit * 10 + n % 10;
            n /= 10;
        }
        return reverseDigit;
    }

    // palindrome for string
    static boolean checkPalindromeString(String originalStr) {
        /*
         * if (reversedStr(originalStr) == originalStr) {
         * return true;
         * }
         * uses == to compare two String objects, which in Java checks for reference
         * equality, not the content of the strings. This means even if the contents are
         * the same, == may return false because they're two different objects in
         * memory.
         * You should use .equals() for content comparison:
         */

        if (reversedStr(originalStr).equalsIgnoreCase(originalStr)) {
            return true;
        }
        return false;
    }

    static String reversedStr(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
            /*
             * Each time you append a character, a new String object is created because
             * Java Strings are immutable. So for a string of length n:
             * This results in O(n²) time complexity due to repeated copying.
             */
        }
        return reverse;
    }
// String Concatenation : O(n²)
// StringBuilder : O(n)
    /*
    - StringBuilder is mutable and efficient for appending.
    - Each character is appended in O(1) time, and since there are n characters, the whole reversal is done in O(n) time.

     * // using stringBuilder 
     * static String reversedStr(String str) {
     * StringBuilder reverse = new StringBuilder();
     * for (int i = str.length() - 1; i >= 0; i--) {
     * reverse.append(str.charAt(i));
     * }
     * return reverse.toString();
     * }
     */

}
