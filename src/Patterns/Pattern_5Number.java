package Patterns;

public class Pattern_5Number {
    public static void Pattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern(4);
    }
}
