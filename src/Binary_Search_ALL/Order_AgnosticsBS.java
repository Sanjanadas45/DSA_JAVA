package Binary_Search_ALL;

public class Order_AgnosticsBS {
    public static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            } else{
                    if(target > arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    public static void main(String[] args){
        int[] arr = {99, 80 , 30, 29, 10, 2, -1, 0};
        int target = 30;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }
 }
