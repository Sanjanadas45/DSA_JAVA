package Strings_Subseq_Recursion;

import java.util.ArrayList;

public class Subseq_ASCII_Ret {
    static ArrayList <String> subseqRetASCII(String p, String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList <String> first = subseqRetASCII(p+ch, up.substring(1));
        ArrayList <String> second = subseqRetASCII(p, up.substring(1));
        ArrayList <String> third = subseqRetASCII(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

    public static void main(String[] args) {
        System.out.println(subseqRetASCII(" ", "abc"));
    }
}
