public class PrimeChecker {
    public static void main(String[] args) {
        // Replace the value of n with your desired upper limit
        int n = 100;
        printPrimesUpToN(n);
    }

    static void printPrimesUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
