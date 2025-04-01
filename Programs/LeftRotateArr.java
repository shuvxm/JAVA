public class LeftRotateArr {
    public static void main(String[] args) {
        // Your code here
        int[] arr = {2,3,4,5,6};
        int n = arr.length;
        int d = 2;
        leftRotate(arr, d, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void leftRotate(int[] arr, int d, int n){
        
        rotate(arr, 0, d - 1);
        rotate(arr, d, n - 1);
        rotate(arr, 0, n - 1);
    }
    static void rotate(int[] arr,int i, int j){
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}