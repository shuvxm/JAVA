package Basic.Grooming;

public class Pattern {
    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();

        printPattern1();
        printPattern2();
        pyramidPattern();
        diamondPattern();
        rightAlignedTriangle();
    }

    /*
     * __1__
     * _121_
     * 12321
     */
    static void pattern1() {
        int n = 3;
        for (int row = 1; row <= n; row++) {
            int a = 0;
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1) {
                    if (col <= n) {
                        a++;
                        System.out.print(a);
                    } else {
                        a--;
                        System.out.print(a);
                    }
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     * __1__
     * _212_
     * 32123
     * 
     */
    static void pattern2() {
        int n = 3;
        for (int row = 1; row <= n; row++) {
            int a = row + 1;
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1) {
                    if (col <= n) {
                        a--;
                        System.out.print(a);
                    } else {
                        a++;
                        System.out.print(a);
                    }
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // diamond problem
    /*
     * __*__
     * _***_
     * ****
     * _***_
     * __*__
     */

    static void pattern3() {
        int n = 3;
        for (int row = 1; row <= n * 2 - 1; row++) {
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1 && row - col <= n - 1 && row + col <= (n * 3 - 1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        int n = 3;

        for (int row = 1; row <= n * 2 - 1; row++) {
            int temp = 0;
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1 && row - col <= n - 1 && row + col <= (n * 3 - 1)) {
                    if (col <= n)
                        temp++;
                    else
                        temp--;
                    System.out.print(temp);
                } else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }

    /*
     * __1__
     * _212_
     * 32123
     * _212_
     * __1__
     */
    static void pattern5() {
        int n = 3;

        for (int row = 1; row <= n * 2 - 1; row++) {
            int temp = row <= n ? row + 1 : (2 * n) - row + 1;
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1 && row - col <= n - 1 && row + col <= (n * 3 - 1)) {
                    if (col <= n)
                        temp--;
                    else
                        temp++;
                    System.out.print(temp);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Pattern programs
    // 1.
    static void printPattern1() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPattern2() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramidPattern() {
        int n = 3; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // diamond problem
    static void diamondPattern() {
        int n = 3;
        for (int row = 1; row <= n * 2 - 1; row++) {
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1 && row - col <= n - 1 && row + col <= (n * 3 - 1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // right-aligned triangle
    static void rightAlignedTriangle() {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
/*
 * __*__
 * __*__
 * *****
 * __*__
 * __*__
 */