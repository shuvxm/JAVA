package Basic;

public class Prime {
    public static void main(String[] args) {
         if (isPrime(11))
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(15))
            System.out.println(" true");
        else
            System.out.println(" false");
    }

    static boolean isPrime(int n){
        // corner case
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) 
            if (n % i == 0) {
                return false;
            }
        return true;   
    }
}
