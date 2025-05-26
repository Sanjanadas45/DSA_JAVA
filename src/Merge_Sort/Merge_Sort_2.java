package Merge_Sort;

import java.util.Arrays;

public class Merge_Sort_2 {
    public static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }
        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }
    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[j+k] = arr[j];
                j++;
            }
            k++;
        }
        //it might be possible that one of the arrays is not complete
        //copy remaining elements
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++){
            arr[s + l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
