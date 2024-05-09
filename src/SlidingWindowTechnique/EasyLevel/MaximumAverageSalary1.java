package SlidingWindowTechnique.EasyLevel;

public class MaximumAverageSalary1 {
    public static void main(String[] args) {
        int ar[]={1,12,-5,-6,50,3};
        System.out.println(maximumAverage(ar,4));
    }

    private static double maximumAverage(int[] ar, int k) {

       double maxSum=0;
       for(int i=0;i<k;i++){
           maxSum+=ar[i];
       }
       double window_sum=maxSum;
       for(int i=k;i<ar.length;i++){
           window_sum+=ar[i]-ar[i-k];
           maxSum=Math.max(maxSum,window_sum);
       }

        return (maxSum/k);
    }
}
