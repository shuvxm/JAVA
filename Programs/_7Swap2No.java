import java.util.Scanner;

public class _7Swap2No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a is " + a + ", b is " + b);

        try {
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println("After swapping: a is " + a + ", b is " + b);
        } catch (Exception e) {
            e.printStackTrace();;
        }
    }
}

// swapped using 2 variable
// a = a+b;
// b = a-b;
// a = a- b;

// Swap using XOR bitwise operator
// a = a ^ b;
// b = a ^ b;
// a = a ^ b;


/*
a = a / b;
b = a * b;
a = b / a;
 * The logic works only when:
 * 
 * a > b
 * b != 0
 * If a < b, integer division (a / b) truncates the result to 0, which causes
 * issues in subsequent calculations. This makes the division-multiplication
 * method unreliable for general inputs.
 */