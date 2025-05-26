package Patterns;

public class Pattern_4Reverse_Right_Pyramid {
    public static void Pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(4);
    }
}
