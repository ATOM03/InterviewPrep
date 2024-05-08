package SlidingWindowTechnique.MediumLevel;

public class MinimumSubArrayLength {

    public static void main(String[] args) {
        int ar[]={2, 3, 1, 2, 4, 3};
        System.out.println(minimumSubarrayLength(ar,7));
    }

    private static int minimumSubarrayLength(int[] ar, int target) {
        int minLength=Integer.MAX_VALUE;
        int windowStart=0;
        int windowSum=0;

        for(int windowEnd=0;windowEnd<ar.length;windowEnd++){
            windowSum+=ar[windowEnd];

            while(windowSum>=target){
                minLength=Math.min(minLength,windowEnd-windowStart+1);
                windowSum-=ar[windowStart];
                windowStart++;
            }
        }
        return minLength!=Integer.MAX_VALUE? minLength:0;
    }


}
