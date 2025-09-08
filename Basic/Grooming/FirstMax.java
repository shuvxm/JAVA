package Basic.Grooming;

// find second max,left rotation and right rotation, sorted matrix, window sliding
public class FirstMax {
    public static void main(String[] args) {
        int[] a = { 10, 20, 12, 14 };
        firstMax(a);
        secondMax(a);

    }

    static void firstMax(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }

    static void secondMax(int[] a) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        // optimize code
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }

        // Brute force approach
        // for (int i = 0; i < a.length; i++) {
        // if (a[i] > max) {
        // max = a[i];
        // }
        // }
        // for (int i = 0; i < a.length; i++) {
        // if (secondMax < a[i]) {
        // if (a[i] == max)
        // continue;
        // else
        // secondMax = a[i];
        // }
        // }
        // System.out.println(max);
        System.out.println(secondMax);
    }
}
// anagram or not