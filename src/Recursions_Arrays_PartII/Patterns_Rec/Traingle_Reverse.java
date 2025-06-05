package Recursions_Arrays_PartII.Patterns_Rec;

public class Traingle_Reverse {
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            triangle(r, c + 1);
        }else{
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    public static void main(String[] args) {
        triangle(4, 0);
    }
}
