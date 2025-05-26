package Patterns;

public class Pattern_24Hollow_Traingle {
    public static void Pattern(int n){
        //for handling rows
        for (int i = 1; i <= n; i++) {
            //for printing spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            //for printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                if(k == 1 || i == n || k == (2 * i - 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(6);
    }
}
