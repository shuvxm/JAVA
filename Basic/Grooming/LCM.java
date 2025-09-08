package Basic.Grooming;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findLCM(a, b));
        System.out.println(findLcmByEuclid(a, b));
    }

    static int findLCM(int a, int b) {
        int result = Math.max(a, b);
        while (true) {
            if (result % a == 0 && result % b == 0) {
                break;
            }
            result++;
        }
        return result;
    }

    static int findLcmByEuclid(int a, int b) {
        return (a * b) / gabrielGCD(a, b);
    }

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
