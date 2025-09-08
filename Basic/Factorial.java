package Basic;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        System.out.println(factorialRecursive(n));
    }

    static int factorial(int n) {
        int fact = 1;
        if (n < 2)
            return 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }
}
