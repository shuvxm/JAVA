// another approach using recursion.
public class Fibonacci {
    public static void main(String[] args) {
        int terms = 10; // specify the number of terms you want in the sequence
        System.out.print("Fibonacci Series for " + terms + " terms: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Function to calculate Fibonacci numbers recursively
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}



/*
 * import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        int range = 100; // specify the range up to which you want the Fibonacci numbers
        System.out.print("Fibonacci Series up to " + range + ": ");

        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
              .limit(100)
              .map(n -> n[0])
              .takeWhile(n -> n <= range)
              .forEach(n -> System.out.print(n + " "));
    }
}

 */