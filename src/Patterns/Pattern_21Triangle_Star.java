package Patterns;

public class Pattern_21Triangle_Star {
    public static void Pattern(int n){
        //loop for handling rows
        for (int i = 0; i < n; i++) {
            //loop for printing spacs
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            //for printing stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(6);
    }
}
