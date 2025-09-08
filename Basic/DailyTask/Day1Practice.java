
public class Day1Practice {
    public static void main(String[] args) {
        int[] arr1 = { 5, 8, 1, 3, 9, 2, 99, -1 };
        System.out.println("Find Max | Min: " + findMaxMin(arr1));

        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of Element: " + sumOfElement(arr2));

        int[] arr3 = { 4, 7, 2, 9, 6, 3 };
        System.out.println("Count Even | Odd: " + countEvenOdd(arr3));

        int[] arr4 = { 1, 2, 3, 2, 2, 4, 5 };
        int target = 2;
        System.out.println("Count Occur of target is: " + countOccurence(arr4, target));
    }

    static String findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return max + " | " + min;
    }

    static int sumOfElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static String countEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenCount++;
            }
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        return evenCount + " | " + oddCount;
    }

    static int countOccurence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
