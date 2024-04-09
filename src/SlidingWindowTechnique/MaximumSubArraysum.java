package SlidingWindowTechnique;

public class MaximumSubArraysum {
    public static void main(String[] args) {
        int[] ar ={100,200,300,400,500};

        System.out.println(maxsum(ar,2));
    }

    private static int maxsum(int[] ar, int k) {
        int n=ar.length;

        if(n<k){
            return -1;
        }

        int max_sum=0;
        for(int i=0;i<k;i++)
            max_sum+=ar[i];

        int window_size=max_sum;

        for(int i=k;i<n;i++){
            window_size+=ar[i]-ar[i-k];

            max_sum=Math.max(window_size,max_sum);
        }
        return max_sum;
    }
}
