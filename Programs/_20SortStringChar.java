/*
 * Sort the string in 2 ways:
 * 1. without using sort method
 * 2. using sort method
 */

import java.util.Arrays;

public class _20SortStringChar {
    public static void main(String[] args) {
        String str = "rock";
        sortString1(str);
        sortString2(str);
    }

    // 1.
    static void sortString1(String str){
        char[] chArr = str.toCharArray();
        // Variable to temporarily hold characters during swapping
        char temp;
        for (int i = 0; i < chArr.length; i++) {
            for (int j = i+1; j < chArr.length; j++) {
                // If the current character is greater than the compared character, swap them
                if(chArr[i] > chArr[j]){
                    // Swap the characters
                    temp = chArr[i];
                    chArr[i] = chArr[j];
                    chArr[j] = temp;
                }
            }
        }
        System.out.println(chArr);
    }
    static void sortString2(String str){
        char[] chArr = str.toCharArray();
        // Sort the character array using Arrays.sort()
        Arrays.sort(chArr);
        System.out.println(chArr);
    }
}
