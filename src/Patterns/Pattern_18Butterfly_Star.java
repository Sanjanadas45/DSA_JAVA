package Patterns;

public class Pattern_18Butterfly_Star {
    public static void Pattern(int n){
        //outer loop for upper part
        for (int i = 1; i <= n; i++) {
            //inner loop for printing stars(in the left side)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //For printing spaces(in the right side)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //For printing stars(in the right side)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop for lower part
        for (int i = n; i >= 1; i--) {
            //inner loop for printing stars(in the left side)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //For printing spaces(in the right side)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            //For printing stars(in the right side)
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
