package Basic.Grooming;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 11, 90, 70, 15, 30, 99 };
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));

    }

}
