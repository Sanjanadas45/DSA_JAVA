package Patterns;

public class Pattern_20K_Pattern {
    public static void Pattern(int n){
        //loop for handling rows for the upper part stars
        for (int i = n; i >= 1; i--) {
            //loop for handling columns for the upper part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //loop for handling rows for the lower part stars
        for (int i = 2; i <= n; i++) {
            //loop for handling columns for the lower part stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(6);
    }
}
