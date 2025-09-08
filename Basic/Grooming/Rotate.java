package Basic.Grooming;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        // print array before rotation
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // leftRotationBy1(arr);
        rotate(arr, 3);
        // to print array after rotation
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // rotate by 1.
    static void leftRotationBy1(int[] arr) {

        // int rotateBy = 1;

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
    // rotate by k elements
    // Observation 1: if k is positive : k % length of arr e.g: k=1: 1%5 = 1
    // Observation 2: if k is negative : k + length of arr

    static void rotate(int[] arr, int k) {

        // for positive
        k = k % arr.length;
        // for negative
        if (k < 0) {
            k = k + arr.length;
        }
        // for (int i = 1; i <= k; i++) {
        // leftRotationBy1(arr);
        // }
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
