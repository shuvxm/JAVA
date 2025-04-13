// 2 ways: one is normal BS and other is recursively BS

import java.util.Arrays;

public class Search_Binary{
    public static void main(String[] args) {
        int[] arr = { 4, 9, 2, 5, 7, 1, 6, 8, 3 };
        // sorted array: 1,2,3,4,5,6,7,8,9
        int target = 9;

        // sort the array first, to apply binary search
        Arrays.sort(arr);

        // int result = binarySearch(arr,target);
        int result = recursivelyBS(arr,target, 0, arr.length-1);

        if(result != -1)
            System.out.println("Element found at index: "+ result);
        else
            System.out.println("element not found");
    }
    private static int recursivelyBS(int[] arr, int target, int left, int right){

        if(left <= right){
            int mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target){
                return recursivelyBS(arr, target, mid+1, right);
            } else{
                return recursivelyBS(arr, target, left, mid-1);
            }
        }
        return -1;
    }
    private static int binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}