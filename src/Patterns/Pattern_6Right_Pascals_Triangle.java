package Patterns;

public class Pattern_6Right_Pascals_Triangle {
    public static void Pattern(int n){
        int i,j;
        // outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // outer loop to handle lower part
        for (i = n-1; i >= 1; i--) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(4);
    }
}
