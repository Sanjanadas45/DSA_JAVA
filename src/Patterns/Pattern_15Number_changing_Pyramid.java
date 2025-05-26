package Patterns;

public class Pattern_15Number_changing_Pyramid {
    public static void Pattern(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) { // outer loop to handle number of rows
            for (int j = 1; j <= i; j++) { // inner loop to handle number of columns
                System.out.print(num +" "); // printing column values upto the row value
                num++; // increasing the value of num.
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(6);
    }
}
