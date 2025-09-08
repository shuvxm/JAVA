package Basic.Grooming;

import java.util.Arrays;

//Assignment:  without inuilt (take 2 for loop)
public class Anagram {
    public static void main(String[] args) {

        String s1 = "tea";
        String s2 = "eat";
        if (s1.length() == s2.length()) {

            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            // s1 = new String(ch1);
            String str1 = new String(ch1);
            String str2 = new String(ch2);
            System.out.println(str1.equals(str2) ? "Anagram" : "not an anagram");
        } else
            System.out.println("lengths are not same, so not an anagram");

    }
}
