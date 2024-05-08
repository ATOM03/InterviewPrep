package SlidingWindowTechnique;

import java.util.HashMap;

public class LongestSubstringWithKdistinctCharacters {
    public static void main(String[] args) {
        String s="abcadcacacaca";
        System.out.println(longestSubsstring(s,3));
    }

    private static int longestSubsstring(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int begin=0,length=0;

        for(int end=0;end<s.length();end++){
            char endChar=s.charAt(end);
            map.put(endChar,map.getOrDefault(endChar,0)+1);

            while(map.size()>k){
                char beginChar=s.charAt(begin);
               map.put(beginChar,map.get(beginChar)-1);

               if(map.get(beginChar)==0)
                   map.remove(beginChar);
               begin++;
            }

            if(end-begin+1>length){
                length=end-begin+1;
                System.out.println(s.substring(begin,end+1));
            }
        }
        return length;
    }
}
