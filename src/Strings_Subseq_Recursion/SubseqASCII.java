package Strings_Subseq_Recursion;

public class SubseqASCII {
    public static void main(String[] args) {
        subseqASCII(" ", "abc");
    }
    static void subseqASCII(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqASCII(p+ch, up.substring(1));
        subseqASCII(p, up.substring(1));
        subseqASCII(p+(ch + 0), up.substring(1));
    }
}
