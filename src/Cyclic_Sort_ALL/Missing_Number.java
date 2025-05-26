package Cyclic_Sort_ALL;

import java.util.Arrays;

public class Missing_Number {
        public static int missing_number(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i];
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
//            search for first missing number
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index) {
                    return index;
                }
            }
            return arr.length;
        }
        public static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        public static void main(String[] args){
            int[] arr = {4, 0, 2, 1};
            missing_number(arr);
            System.out.println(Arrays.toString(arr));
        }
}
