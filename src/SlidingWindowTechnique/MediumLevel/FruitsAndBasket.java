package SlidingWindowTechnique.MediumLevel;

import java.util.HashMap;
import java.util.Map;

public class FruitsAndBasket {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,2};
        System.out.println(maxLeng(ar));
    }

    private static int maxLeng(int[] ar) {
        Map<Integer,Integer>map=new HashMap<>();
        int start=0,end=0,counter=0,length=0;

        while(end<ar.length){
            int a=ar[end];
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.get(a)==1)counter++;
            end++;

            while(counter>2){
                int temp=ar[start];
                map.put(temp,map.get(temp)-1);
                if(map.get(temp)==0)counter--;
                start++;
            }
            length=Math.max(length,end-start);
        }
        return length;

    }
}
