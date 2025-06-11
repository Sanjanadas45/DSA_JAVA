//Take a number as input and print the multiplication table for it.
package ASSIGNMENTS;

public class Multiplication_Table {
    public static void main(String[] args) {
        int a=5;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(a + "*" + i + "=" + (a * i));
        }
    }
}
