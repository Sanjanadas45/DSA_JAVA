package Patterns;

public class Pattern_23Mirror_Img_Triangle {
    public static void Pattern(int n){
        //for upper part
        for (int i = 1; i <= n; i++) {
            //for printing spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //for printing value of j(printing numbers)
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            }
            //for lower part
            for (int i = n - 1; i >= 1; i--) {
                //for printing spaces
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                //for printing value of j(printing numbers)
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
