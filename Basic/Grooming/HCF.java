package Basic.Grooming;

import java.util.Scanner;

// GCD or HCF
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        gcd(a, b);
        System.out.println(gcd1(a, b));
        System.out.println(gabrielGCD(a, b));
        System.out.println(euclidGCD(a, b));

    }

    // brute force approach with void return type
    static void gcd(int a, int b) {
        int min = 0;
        if (a < b)
            min = a;
        else
            min = b;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    // brute force approach with int return type
    static int gcd1(int a, int b) {
        int min = 0;
        if (a < b)
            min = a;
        else
            min = b;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    // optimized code
    static int euclidGCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    // more optimsed : drawback of euclid's
    static int gabrielGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a != 0)
            return a;
        else
            return b;
    }
}
