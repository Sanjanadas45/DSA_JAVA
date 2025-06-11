import java.util.*;
public class NoOfDigits {
    public static void main(String[] args) {
        int n = 34567; //count the number of digits in this number
        int b = 10; //in decimal base, you can change this into any base and calculate its corresponding value
        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
}
