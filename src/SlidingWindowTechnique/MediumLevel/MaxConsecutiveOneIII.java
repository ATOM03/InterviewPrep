package SlidingWindowTechnique.MediumLevel;

public class MaxConsecutiveOneIII {
    public static void main(String[] args) {
        int ar[]={1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maxconsecutive(ar,2));
    }

    private static int maxconsecutive(int[] ar, int k) {

        int begin=0,end=0,zeroCount=0,length=0;

        while(end<ar.length){

            if(ar[end]==0)
                zeroCount++;

            while(zeroCount>k){
                if(ar[begin]==0)
                    zeroCount--;
                begin++;

            }
            if(zeroCount<=k){
                length=Math.max(length,end-begin+1);
            }
            end++;
        }
        return length;
    }
}
