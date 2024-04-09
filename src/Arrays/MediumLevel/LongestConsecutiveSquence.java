package Arrays.MediumLevel;
//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//You must write an algorithm that runs in O(n) time.
//
//
//
//Example 1:
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//Example 2:
//
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9

//https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.Arrays;

public class LongestConsecutiveSquence {
    public static void main(String[] args) {
        int ar[]={1,2,0,1};
        System.out.println(longestconsecutive(ar));
    }

    private static int longestconsecutive(int[] ar) {
        Arrays.sort(ar);
        int length=1;
        int max=0;
        for(int i=0;i<ar.length-1;i++){
            //need to check whether the array have the repeat element...
            if(ar[i]!=ar[i+1]) {
                if (ar[i] + 1 == ar[i + 1])
                    length++;

                else {
                    max = Math.max(max, length);
                    length = 1;
                }
            }
        }

        return Math.max(max,length);
    }
}
