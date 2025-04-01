
/* 
When is it not critical to close Scanner?
If you're working with System.in (like in this case), not closing it at the end of the program doesn't typically cause major issues because the program terminates, and the JVM automatically cleans up system resources.
However, if you use Scanner with other input streams (e.g., a file or a network connection), failing to close it can lead to memory leaks and locked resources.
 */
import java.util.Scanner;

public class _11NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();
        countDigits(number);
    }

    private static void countDigits(int number) {
        int count = 0;
        int originalNumber = number;

        // edge cases for Zero
        if (number == 0)
            count = 1;
        // edge cases for negative nos
        // number = Math.abs(number); // handle negative numbers
        else if (number < 0)
            number = number * -1;

        while (number > 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits in " + originalNumber + " is: " + count);
    }
}
