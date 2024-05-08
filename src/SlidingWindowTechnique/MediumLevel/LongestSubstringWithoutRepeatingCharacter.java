package SlidingWindowTechnique.MediumLevel;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s="bbbb";

        System.out.println(longestSubString(s));
    }

    private static int longestSubString(String s) {

        Map<Character,Integer>map=new HashMap<>();

        int begin=0,end,length=0;
        String ans="";

      for(end=0;end<s.length();end++){
            char endChar=s.charAt(end);

            if(!map.containsKey(endChar) || map.get(endChar)<begin){
               map.put(endChar,end);
               length=Math.max(length,end-begin+1);
               ans=s.substring(begin,end+1);
                System.out.println(ans);
            }
            else{
                begin=map.get(endChar)+1;
                map.put(endChar,end);
            }

        }
        return length;
    }
}
