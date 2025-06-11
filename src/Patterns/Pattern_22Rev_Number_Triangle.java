package Patterns;

public class Pattern_22Rev_Number_Triangle {
    public static void Pattern(int n){
        //for handling rows
        for (int i = 1; i <= n; i++) {
            //for printing spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //for printing numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(6);
    }
}
