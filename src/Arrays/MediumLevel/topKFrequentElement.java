package Arrays.MediumLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
        List<Integer>list=new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        int res[] = new int[k];
        for (int i = 0; i < k; ++i)
            res[i] = list.get(i);
        return res;
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
