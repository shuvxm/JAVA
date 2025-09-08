package Basic.Grooming;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 10, 20, 40, 50, 30 };
        int key = -1;
        if (binarySear(a, key)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    static boolean binarySear(int[] a, int key) {
        Arrays.sort(a);
        int st = 0, end = a.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (key == a[mid])
                return true;
            else if (key > a[mid])
                st = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
