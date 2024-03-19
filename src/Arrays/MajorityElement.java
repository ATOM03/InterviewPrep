package Arrays;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//

//https://leetcode.com/problems/majority-element/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int ar[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(ar));
        System.out.println(majorityElementEasyWay(ar));
    }

    private static int majorityElementEasyWay(int[] ar) {
        int n=ar.length;
        Arrays.sort(ar);
        return ar[n/2];
    }

    private static int majorityElement(int[] nums) {
        int n=nums.length;
        if(nums.length==1)
            return nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        n=n/2;
        for (Map.Entry<Integer,Integer> tempMap : map.entrySet()){
            Integer key=tempMap.getKey();
            Integer value=tempMap.getValue();
           if(value>n)
               return key;
        }
        return -1;
    }


}
