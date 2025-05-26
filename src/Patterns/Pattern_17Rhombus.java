package Patterns;

public class Pattern_17Rhombus {
    public static void Pattern(int n){
        int i,j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // printing new line for each row
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(6);
    }
}
