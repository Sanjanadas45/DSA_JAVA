package Patterns;

public class Pattern_11Hollow_Square {
    public static void Pattern(int n){
        int i,j;
        for (i = 0; i < n; i++) { //outer loop for rows
            for (j = 0; j < n; j++) { //inner loop for number of columns
                //star will print when it is first row or last row or first column or last column
                // first row || last column|| first column || last columnn
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){
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
