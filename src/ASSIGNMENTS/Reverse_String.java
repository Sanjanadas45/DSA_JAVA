//Reverse A String In Java
package ASSIGNMENTS;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        Rev_String(st);
        sc.close();
    }
    public static void Rev_String(String str){
        if(str == null){
            System.out.println("Invalid input");
        }
        else {
            String str1 = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                str1 += str.charAt(i);
                System.out.println("Reverse String is: " +str1);
                }
        }
    }
    // This method can also be used(String Builder)
    // String str = "hello";
    // StringBuilder sb = new StringBuilder(str);
    // String reversedStr = sb.reverse().toString();
    // System.out.println(reversedStr); // Output: olleh
}
