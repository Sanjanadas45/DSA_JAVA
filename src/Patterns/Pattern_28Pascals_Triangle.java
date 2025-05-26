package Patterns;

public class Pattern_28Pascals_Triangle {
    public static void Pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                //for left spacing
                System.out.print(" ");
            }
            // used to represent x(i, k)
            int x = 1;
            for (int k = 1; k <= i; k++) {
                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * ( i - k)/k;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(6);
    }
}
