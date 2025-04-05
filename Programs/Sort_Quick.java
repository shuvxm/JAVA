public class Sort_Quick {
    public static void main(String[] args) {
        int[] arr = { 4, 9, 2, 5, 7, 1, 6, 8, 3 };
        int begin = 0;
        int end = arr.length - 1;
        quickSort(arr, begin, end);

        // Print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            // find the partition
            int partition = findPartition(arr, begin, end);

            // do quick sort on left part
            quickSort(arr, begin, partition - 1);
            // do quick sort on right part
            quickSort(arr, partition + 1, end);
        }
    }
    static int  findPartition(int[] arr, int begin,int end){

        // taking last element as pivot
        int pivot = arr[end];
        int i = begin -1; // index of smaller element
        for(int j=begin;j<end;j++){
            // if current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }    
}
