package Arrays.MediumLevel;

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Example 2:
//
//Input: strs = [""]
//Output: [[""]]
//Example 3:
//
//Input: strs = ["a"]
//Output: [["a"]]

//https://leetcode.com/problems/group-anagrams/description/

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String s[]={"eat","tea","tan","ate","nat","bat"};
        List< List<String>>list=new ArrayList<>();;
        list=groupAnagram(s);
        System.out.println(list);
    }

    private static List<List<String>> groupAnagram(String[] s) {
        HashMap<String,List<String>>map=new HashMap<>();
        for (int i = 0; i < s.length; i++) {
           char sort[]=s[i].toCharArray();
           Arrays.sort(sort);
           String sortWord=new String(sort);

           if(!map.containsKey(sortWord))
               map.put(sortWord,new ArrayList<>());

           map.get(sortWord).add(s[i]);
        }
        return new ArrayList<>(map.values());
    }
}
