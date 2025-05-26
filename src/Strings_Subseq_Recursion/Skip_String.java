package Strings_Subseq_Recursion;

public class Skip_String {
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(5));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bccappledah"));
    }
}
