package SlidingWindowTechnique.MediumLevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaooo";

        System.out.println(permutationInString(s1,s2));
    }

    private static boolean permutationInString(String s1, String s2) {
        Map<Character, Integer> table = new HashMap<>();

        for(char c : s1.toCharArray()){
            table.put(c, table.getOrDefault(c, 0) + 1);
        }

        int begin = 0, end = 0, counter = table.size();

        while(end < s2.length()){
            char endchar = s2.charAt(end);

            if(table.containsKey(endchar)){
                table.put(endchar, table.get(endchar) - 1);
                if(table.get(endchar) == 0) counter--;
            }

            end++;

            while(counter == 0){
                if(end - begin == s1.length()) return true;

                char startchar = s2.charAt(begin);

                if(table.containsKey(startchar)){
                    table.put(startchar, table.get(startchar) + 1);
                    if(table.get(startchar) > 0) counter++;
                }

                begin++;
            }
        }

        return false;
    }
}
