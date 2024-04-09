package Arrays.MediumLevel;
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
//
//
//
//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation:
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.
//Example 2:
//
//Input: nums = [0,1,1]
//Output: []
//Explanation: The only possible triplet does not sum up to 0.
//Example 3:
//
//Input: nums = [0,0,0]
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.

//https://leetcode.com/problems/3sum/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_TwoPointer {
    public static void main(String[] args) {
        int ar[]={-1,0,1,2,-1,-4};
        List<List<Integer>>list=threeSum(ar);
        System.out.println(list);
    }

    private static List<List<Integer>> threeSum(int[] ar) {
        Arrays.sort(ar);
        int n=ar.length;

        List<List<Integer>>list=new ArrayList<>();


        for (int k = 0; k <n-2 ; k++) {
            if(k>0 && ar[k]==ar[k-1])
                continue;

           int i=k+1;
           int j=n-1;
           List<Integer>temp=new ArrayList<>();
           while(i<j) {

               if (ar[k] + ar[i] + ar[j] > 0) {
                   j--;
               }
               else if (ar[k] + ar[i] + ar[j] < 0) {
                   i++;
               }
               else if (ar[k] + ar[i] + ar[j] == 0) {
                   list.add(Arrays.asList(ar[k],ar[i],ar[j]));
                   i++;
                   j--;
                   while(i < j && ar[i] == ar[i - 1]) i++;
                   while(i < j && ar[j] == ar[j + 1]) j--;
               }
           }


       }
        return list;
    }
}
