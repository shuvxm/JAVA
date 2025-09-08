package Basic.Grooming;

import java.util.Scanner;

public class B2D {

    static String decimalToBinary(int n) {

        String b = "";

        while (n >= 1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        return b;
    }

    static int binaryToDecimal(String b) {
        int result = 0;
        int powOf2 = 1;

        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                result += powOf2;
            }
            powOf2 = powOf2 * 2;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = decimalToBinary(n);
        System.out.println(b);
        System.out.println(binaryToDecimal(b));

    }

    // abstract void m1(); // not allowed abstract method in normal class

}

interface A {
    public static void m1() { // public static method
    }

    public abstract void m2(); // abstract

    public void m3(); // compiler will add abstract in method (interface)

    default void m4() { // default non static method
    }

    private static void m5() {
    }

    private void m6() {
    }
    // private abstract void m7(); // not allowed
}