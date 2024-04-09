package Arrays.EasyLevel;

import java.util.HashMap;

public class MostFrequentEvenNumber {
    public static void main(String[] args) {
        int ar[]={4,4,4,9,2,4};
        System.out.println(mostfrequent(ar));
    }

    private static int mostfrequent(int[] nums) {
        int n=nums.length;
        int maxCount=0;
        int element=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(isEven(nums[i])){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                    if(map.get(nums[i])>maxCount){
                        maxCount= map.get(nums[i]);
                    }
                }
                else{
                    map.put(nums[i], 1);
                    if(map.get(nums[i])>maxCount){
                        maxCount= map.get(nums[i]);
                    }
                }
            }
        }
        for(int key: map.keySet()){
            if(map.get(key)==maxCount)
                element=Math.min(key,element);
        }
        if(element == Integer.MAX_VALUE){
             return -1;
         }
        return element;


    }
    public static boolean isEven(int n){
        return (n%2==0)?true:false;
    }
}
