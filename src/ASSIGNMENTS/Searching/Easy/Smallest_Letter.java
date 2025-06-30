//Find Smallest Letter Greater Than Target
package ASSIGNMENTS.Searching.Easy;

public class Smallest_Letter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        if(target >= letters[end]){
            return letters[0];
        }
        while(start < end){
            int mid = start + (end - start) / 2;
            if(letters[mid] < target)
                start = mid + 1;
            else
                end = mid;
        }
        return letters[end];
    }
}
