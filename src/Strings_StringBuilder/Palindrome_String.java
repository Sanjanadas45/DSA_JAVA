package Strings_StringBuilder;

public class Palindrome_String {
    public static void main(String[] args){
        String str = "abcba";
        System.out.println(isPalin(str));
    }
    public static boolean isPalin(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        str = str.toLowerCase(); //It's optional to convert the string into lowercase
        for( int i = 0; i <= str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1 -i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
