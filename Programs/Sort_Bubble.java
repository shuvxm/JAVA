import java.util.Arrays;

public class Sort_Bubble{
    public static void main(String[] args) {
        int[] arr = {7,5,6,9,4,8,2,-1};
        sort(arr);
    }
    static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}