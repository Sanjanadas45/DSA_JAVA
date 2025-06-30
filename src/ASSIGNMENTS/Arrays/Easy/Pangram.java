package ASSIGNMENTS.Arrays.Easy;

public class Pangram {
    public static void main(String[] args) {
        String str = "abcdefghijklomnpuytrwqsxz";
        System.out.println(Pangram(str));
    }
    public static boolean Pangram(String str){
        // There are 26 letters in the English alphabet
        boolean[] seen = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true;
            }
        }
        // Check if all letters have been seen
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                return false;
            }
        }
        return true;
    }
}
