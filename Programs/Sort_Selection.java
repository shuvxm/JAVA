import java.util.Arrays;

public class Sort_Selection {
    public static void main(String[] args) {
        int[] arr = {0,4,6,1,5,3,2,-1};
        sort(arr);
    }
    static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_index])
                    min_index=j;
            }
            // swap
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
