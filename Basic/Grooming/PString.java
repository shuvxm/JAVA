package Basic.Grooming;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class PString {
    public static void main(String[] args) {

        // findVowelConsonants();

        // swap2String();
        // reverseString();
        // isPalindrome();
        // findOccurence();
        // findOccurence2();
        // removeDuplicate();
        // isAnagram();
        // reverse2();
        System.out.println(isPlaindrome1() ? "palindrome" : "not palindrome");
    }

    // to find vowels and consonants
    static void findVowelConsonants() {
        String str = "banana";
        str = str.toLowerCase();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                // System.out.println("vowels " + str.charAt(i) + " ");
                vowels.append(str.charAt(i));
            } else
                // System.out.println("consonants " + str.charAt(i));
                consonants.append(str.charAt(i));
        }
        System.out.println("consonants: " + consonants);
        System.out.println("vowels: " + vowels);
    }

    static void swap2String() {
        String s1 = "java";
        String s2 = "world";

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }

    static void reverseString() {
        String str = "java world";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    static void reverse2() {
        String str = "java";
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String s = new String(ch);
        System.out.println(s);
    }

    static void isPalindrome() {
        String str = "namaan";
        String rev = "";
        str = str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(str.equals(rev) ? "palindrome " : "not a palindrome");
    }

    static boolean isPlaindrome1() {
        String str = "naman";
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            if (ch[i] == ch[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    static void findOccurence() {
        String s1 = "hello world";
        String s2 = "";
        while (s1.length() > 0) {
            char ch = s1.charAt(0);
            // s2 = s1.replace(ch + " ", "");
            s2 = s1.replace(String.valueOf(ch), "");
            int count = s1.length() - s2.length();
            System.out.println(ch + ":" + count);
            s1 = s2;
        }
    }

    // OR
    static void findOccurence2() {
        String s1 = "hello world";
        s1 = s1.replace(" ", ""); // remove spaces
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (java.util.Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    // find frequency of substring
    static void findFrequency() {
        String str = "abc bcd abc bcd xyz";
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.split()) {

            }
        }

    }

    // remove duplicates from given string
    static void removeDuplicate() {
        String str = "banana";
        String result = "";
        String unique = "";

        while (str.length() > 0) {
            char ch = str.charAt(0);
            result = str.replace(ch + "", "");
            unique += ch;
            str = result;
        }
        System.out.println(unique);
    }

    // given string is anagram or not
    static void isAnagram() {
        String s1 = "tea";
        String s2 = "eat";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String str1 = new String(ch1);
        String str2 = new String(ch2);

        System.out.println(str1.equals(str2) ? "anagram" : "not an anagram");
    }

}
