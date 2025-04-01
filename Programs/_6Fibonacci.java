import java.util.Scanner;

public class _6Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of terms: ");
        int noOfTerms = sc.nextInt();

        int first = 0, second = 1, next;
        for (int i = 1; i <= noOfTerms; i++) {
            System.out.print(first+" ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
