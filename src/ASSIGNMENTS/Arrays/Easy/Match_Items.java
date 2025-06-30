//Count Items Matching a Rule
package ASSIGNMENTS.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class Match_Items {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) { //for(int i = 0; i < items.size(); i++)
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue))
                count++;
            if (ruleKey.equals("color") && item.get(1).equals(ruleValue))
                count++;
            if (ruleKey.equals("name") && item.get(2).equals(ruleValue))
                count++;
        }
        return count++;
    }
}
