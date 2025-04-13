public class Search_Linear {
    public static void main(String[] args) {
        int[] arr = { 4, 9, 2, 5, 7, 1, 6, 8, 3 };
        int target = 3;
        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    private static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
