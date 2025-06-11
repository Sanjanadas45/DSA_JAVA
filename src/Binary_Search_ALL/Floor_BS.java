package Binary_Search_ALL;

public class Floor_BS {
    public static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
//            ans found
            else {
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 19, 20, 22};
        int target = 15;
        System.out.println(Floor(arr, target));
    }
}
