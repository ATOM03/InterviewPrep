package Arrays.MediumLevel;

//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
//Example 2:
//
//Input: nums = [1], k = 1
//Output: [1]

//https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.*;

public class topKFrequentElement {
    public static void main(String[] args) {
        int ar[]={1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};
        int k=3;

        int temp[]=topkfrequentelement(ar,k);

        for (int i = 0; i <temp.length ; i++) {
            System.out.print(temp[i]+" ");
        }
    }

    private static int[] topkfrequentelement(int[] ar, int k) {
        Arrays.sort(ar);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            if(!map.containsKey(ar[i])){
                map.put(ar[i],1);
            }
            else {
                map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
            }
        }
        PriorityQueue<Map.Entry<Integer,Integer>>queue=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer>key:map.entrySet()){
            queue.add(key);
        }
        int an[]=new int[k];
        for(int i=0;i<k;i++){
            an[i]=queue.poll().getKey();
        }
        return an;
//        List<Integer> list=new ArrayList<>();
//
//        for(Integer key: map.keySet()){
//            if(map.get(key)>=k)
//                list.add(key);
//        }
//        int temp[]=list.stream().mapToInt(i -> i).toArray();
//        return temp;
    }
}
