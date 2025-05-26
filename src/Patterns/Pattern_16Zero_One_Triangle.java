package Patterns;

public class Pattern_16Zero_One_Triangle {
    public static void Pattern(int n){
        for (int i = 1; i <= n; i++) { //outer loop to handle number of rows
            for (int j = 1; j <= i; j++) { //inner loop to handle number of columns
                // if the sum of (i+j) is even then print 1
                if((i + j) % 2 == 0){
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(4);
    }
}
