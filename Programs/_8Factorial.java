import java.util.Scanner;

public class _8Factorial {
    public static void main(String[] args) {
        // int number = 5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int number = sc.nextInt();
        factorial(number);
    }

    private static void factorial(int number) {
        int factorial=1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+number+" is "+ factorial);
    }
}
