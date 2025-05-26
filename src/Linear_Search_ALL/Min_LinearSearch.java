package Linear_Search_ALL;

public class Min_LinearSearch {
    public static int Min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = { 4, 40, 44, 443, 444};
        System.out.println(Min(arr));
    }
}
