//To find out whether the given String is Palindrome or not.
package ASSIGNMENTS;
import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        System.out.println(palindrome(str));
    }
    static boolean palindrome(String str){
        if(str == null){
            return true;
        }
        else {
            for (int i = 0; i < str.length() - 1; i++) {
                char start = str.charAt(i);
                char end = str.charAt(str.length() - 1 - i);
                if(start != end){
                    return false;
                }
            }
        }
        return true;
    }
}
