import java.util.Scanner;

public class _13SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();
        System.out.println(" Sum of digits of "+number+" is: "+calculateSumOfDigits(number));;
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        
        while (number > 0) {
            int lastDigit = number % 10; // Extract the last digit
            sum = sum + lastDigit;  // Add the digit to sum
            number/=10;  // Remove the last digit from number
        }
        return sum;
    }
}
