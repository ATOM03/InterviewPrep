package Strings;

import java.util.HashMap;

public class WorldPattern {
    public static void main(String[] args) {
        String pattern="abba";
        String s="dog dog dog dog";
        System.out.println(wordpattern(pattern,s));
    }

    private static boolean wordpattern(String pattern, String s) {
        String s_split[]=s.split(" ");
        if(pattern.length()!=s_split.length)
            return false;
        HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Character>map1=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(!map1.containsKey(s_split[i])) {
                    map.put(pattern.charAt(i), s_split[i]);
                    map1.put(s_split[i],pattern.charAt(i));
                }
                else
                    return false;
            }
            else{
                String value=map.get(pattern.charAt(i));
                if(!value.equals(s_split[i]))
                    return false;

            }
        }
        return true;
    }
}
