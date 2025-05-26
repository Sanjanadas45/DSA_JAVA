package Patterns;

public class Pattern_2Square_Fill {
    public static void Pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(4);
    }
}
