/*
An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits in the number
153 is an Armstrong number because 1^3+5^3+3^3=153 

*/

import java.util.Scanner;

public class _10ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is "+ number+" an armstrong no? "+ isArmstrong1(number));
    }

    private static boolean isArmstrong(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Number of digits: "+count);

        int lastDigit, sum=0;
        temp = number;
        while (temp > 0) {
            lastDigit = temp % 10;
            sum = sum + (int) Math.pow(lastDigit, count);
            temp /= 10;
        }
        // checker
        // if(sum == number)
        //     return true;
        // else
        //     return false;
        
        // Return true if the sum matches the original number
        return sum == number;
    }

    static boolean isArmstrong1(int number){

        // using String's length method for simplicity
        int count = String.valueOf(number).length();
        
        int sum=0, originalNumber = number;
        while (number > 0) {
            int lastDigit = number%10;
            sum += Math.pow(lastDigit, count);
            number/=10;
        }
        return sum == originalNumber;
    }
}
