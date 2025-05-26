import java.util.*;
public class Bubble_Sort {
    public static void bubble_sort(int[] arr){
        boolean swapped;
//        run the steps n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
//                swap if the item is smaller than the previous item
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
//            if we didn't swap for a particular value of i, it means the array is sorted. Hence, stop the program
            if(swapped){ //!false =  true
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {-1, 3, 4, 5, -2, 0, 9, 10};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
