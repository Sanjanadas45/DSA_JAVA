package Binary_Search_ALL;

public class Binary_Search { //Used for sorted arrays
    public static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = { 29, 30, 49, 60, 70, 89, 890};
        int target = 89;
        System.out.println(binary_search(arr, target));
    }
}
