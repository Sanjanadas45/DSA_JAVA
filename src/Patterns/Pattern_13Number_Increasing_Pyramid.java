package Patterns;

public class Pattern_13Number_Increasing_Pyramid {
    public static void Pattern(int n){
        for (int i = 1; i <= n; i++) { // outer loop to handle number of rows
            for (int j = 1; j <= i; j++) { // inner loop to handle number of columns
                System.out.print(j +" "); // printing column values upto the row value
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(4);
    }
}
