import java.util.Arrays;

public class _26Merge2Array {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = new int[a.length + b.length]; // 3+3=6

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i]; // {1,2,3,0,0,0}
        }
/*
Iteration 1: i = 0 → c[0 + 3] = b[0] = 4 → c = {1, 2, 3, 4, 0, 0}
Iteration 2: i = 1 → c[1 + 3] = b[1] = 5 → c = {1, 2, 3, 4, 5, 0}
Iteration 3: i = 2 → c[2 + 3] = b[2] = 6 → c = {1, 2, 3, 4, 5, 6}
 */        
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        System.out.println(Arrays.toString(c));// The Arrays.toString(c) method converts the array into a string representation for printing.
    }
}
