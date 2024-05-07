package SlidingWindowTechnique;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s="ABAB";
        System.out.println(longestRepeating(s,2));
    }

    private static int longestRepeating(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int begin=0,end=0,length=0;

        while(end<s.length()){
            char endChar=s.charAt(end);
            if(!map.containsKey(endChar))
                map.put(endChar,map.getOrDefault(endChar,0)+1);
            else {
                map.put(endChar, map.get(endChar) + 1);
            }

            int maxF= (Collections.max(map.values()));

            if((end-begin+1)-maxF>k){
                char startChar=s.charAt(begin);
                map.put(startChar,map.get(startChar)-1);
                begin++;
            }
            length=Math.max(length,end-begin+1);
            end++;
        }
        return length;
    }
}
