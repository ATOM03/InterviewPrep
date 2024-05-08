package SlidingWindowTechnique.MediumLevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";

        System.out.println(findAnagrams(s,p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map=new HashMap();
        List<Integer>list=new ArrayList<>();

        for(Character ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int begin=0,end=0,counter=map.size(), word_size=p.length();

        while(end<s.length()){
            char endChar=s.charAt(end);

            if(map.containsKey(endChar)){
                map.put(endChar,map.get(endChar)-1);
                if(map.get(endChar)==0) counter--;

            }
            end++;
            while(counter==0){

                if(end-begin==word_size)
                    list.add(begin);

                char beginChar=s.charAt(begin);
                if(map.containsKey(beginChar)){
                    map.put(beginChar,map.get(beginChar)+1);
                    if(map.get(beginChar)>0)counter++;
                }
                begin++;

            }

        }
        return list;
    }
}
