package Patterns;

public class Pattern_19Reverse_Left_Pyramid {
    public static void Pattern(int n){
        //outer loop for handling rows
        for (int i = n; i > 0; i--) {
            //loop for printing spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            //inner loop for printing stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(6);
    }
}
