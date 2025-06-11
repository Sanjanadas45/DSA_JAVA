package Patterns;

public class Pattern_8Palindrome_Triangular {
    public static void Pattern(int n){
        int row, space, col;
        for (row = 1; row <= n ; row++) {
            for (space = 0; space < (n - row); space++) {
                System.out.print(" ");
            }
            for(col = row; col >= 1; col--){
                System.out.println(col +" ");
            }
            for (col = 2; col <= row ; col++) {
                System.out.println(col +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(5);
    }
}
