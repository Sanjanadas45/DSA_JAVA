package Strings_Subseq_Recursion;

public class Skip1 {
    static String skipApple(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skipApple("bccappledah"));
    }
}
