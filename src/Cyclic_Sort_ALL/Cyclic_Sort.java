package Cyclic_Sort_ALL;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void cyclic_sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 2, 1, 4};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
