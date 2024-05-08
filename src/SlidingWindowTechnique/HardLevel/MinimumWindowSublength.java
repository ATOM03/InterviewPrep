package SlidingWindowTechnique.HardLevel;

import java.util.HashMap;

public class MinimumWindowSublength {
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";

        System.out.println(minimumSublength(s,t));
    }

    private static String minimumSublength(String s, String t) {

        HashMap<Character,Integer>table=new HashMap<>();
        for(Character c:t.toCharArray()){
            table.put(c,table.getOrDefault(c,0)+1);
        }

        int begin=0,end=0;
        String ans="";
        int length=Integer.MAX_VALUE;
        int counter=table.size();

        while(end<s.length()){
            char endchar=s.charAt(end);

            if(table.containsKey(endchar)){
                table.put(endchar,table.get(endchar)-1);
                if(table.get(endchar)==0) counter--;
            }
            end++;

            while(counter==0){
                if(end-begin<length) {
                    length = end - begin;
                    ans = s.substring(begin, end);
                }

                char beginChar=s.charAt(begin);
                if(table.containsKey(beginChar)){
                    table.put(beginChar,table.get(beginChar)+1);
                    if(table.get(beginChar)>0)counter++;
                }
                begin++;

            }

        }
        return ans;
    }
}
