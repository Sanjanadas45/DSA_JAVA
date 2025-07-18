package Strings_Subseq_Recursion;

public class Permutations_3 {
    public static void main(String[] args) {
        System.out.println(permutationsCount("", "abc")); // The initial empty string for p and the string to permute for up
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}