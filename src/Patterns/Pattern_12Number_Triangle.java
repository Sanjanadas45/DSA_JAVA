package Patterns;

public class Pattern_12Number_Triangle {
    public static void Pattern(int n){
        for (int i = 1; i <= n; i++) { //outer loop for rows
            for (int j = 1; j <= n - i; j++) { //inner loop for space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(4);
    }
}
