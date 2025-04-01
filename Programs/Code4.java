package Java2025;

import java.util.Scanner;

/* Odd Even */
public class Code4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number? ");
        int number = sc.nextInt();
        if(number % 2 == 0)
            System.out.println(number+ " is even");
        else
            System.out.println(number +" is odd");
    }
}
