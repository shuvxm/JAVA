public class Sort_Merge {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 5, 4, 8, 0, 1 };
        // int numerOfElements
        mergeSort(arr, arr.length);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void mergeSort(int[] arr, int numerOfElements) {

        // edge cases
        if (numerOfElements < 2)
            return;

        // find the middle position and create left & right partition
        int mid = numerOfElements / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[numerOfElements - mid];

        // fill up the partitions
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < numerOfElements; i++) {
            rightArr[i - mid] = arr[i];
        }

        // apply mergesort into left partitions
        mergeSort(leftArr, mid);
        // apply mergesort into right partitions
        mergeSort(rightArr, numerOfElements - mid);

        // finally merge the partitions
        merge(arr, leftArr, rightArr, mid, numerOfElements - mid);
    }

    static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
        int i = 0, j = 0, k = 0;

        // merge arrays based on smaller values
        while (i < left && j < right) {
            if (leftArr[i] < rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        // But What If One Array Finishes First?
        // Once that loop finishes, one of the arrays might still have remaining
        // elements. This is where the two while loops come in:
        // Suppose rightArr finishes first, but leftArr still has items left.
        // Since both arrays are already sorted, the remaining items in leftArr are
        // larger than all items already placed, so we can safely append them to the end of arr.
        // fill out remaining values if any
        while (i < left) {
            arr[k++] = leftArr[i++];
        }
        while (j < right) {
            arr[k++] = rightArr[j++];
        }
    }
}
