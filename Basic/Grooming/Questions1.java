package Basic.Grooming;

public class Questions1 {
    public static void main(String[] args) {
        // swap2No();
        // String binary = "101";
        // binaryToDecimal(binary);

        // int prime = 10;
        // System.out.println(isPrime(prime) ? "prime no" : "not a prime no");
        // fibonacci();
        // System.out.println(armstrongNo() ? "armstrong no" : "not an armstrong no");
        // System.out.println(armstrongNo());

    }

    static void swap2No() {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }

    static void fibonacci() {
        int n = 10;
        int first = 0, second = 1;
        int next = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }

    // static void strongNumber(){
    // int n = 143;
    // while(n>0){
    // int lastDigit =
    // }
    // }

    static boolean armstrongNo() {
        int originalNo = 153;
        int n = originalNo;
        int count = 0;
        double res = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        int temp = originalNo;
        while (temp > 0) {
            int lastDigit = n % 10;
            res = res + Math.pow(lastDigit, count);
        }
        if (res == originalNo) {
            return true;
        }
        return false;

    }

}
