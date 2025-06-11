package Binary_Search_ALL;

public class RBS { //AMAZON & GOOGLE Interview Question
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
//            4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int search(int[] arr, int target){
        int pivot = findPivot(arr);
//        if pivot is not found, it means the array is not rotated
        if(pivot == -1){
//            just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }
//        if pivot is found, it means we've found 2 asc sorted array
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/ 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
    }
}
