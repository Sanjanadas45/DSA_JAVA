import java.util.*;
public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int[][] = new int[3][3];
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr.length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
//        output
        for(int row = 0; row < arr.length; row++) {
            int col;
            for (col = 0; col < arr[row].length; col++)
                arr[row][col] = sc.nextInt();
            System.out.print(arr[row][col] + " ");
        }
        System.out.println();
    }
}
