/*
 * 101: palindrome cos from last of this number is equal to the original number
 * 123: 321 not equal
 */

import java.util.Scanner;

public class _12PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is "+ number+" a palindrome no? "+ isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        int reversedNo = 0;
        int originalNumber = number;

         // Reverse the number
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNo = reversedNo * 10 + lastDigit;
            number/=10;
        }
        // if(originalNumber == reversedNo)
        //     return true;
        // else
        //     return false;
        return originalNumber == reversedNo; // Check if the original number is equal to the reversed number
    }
}
