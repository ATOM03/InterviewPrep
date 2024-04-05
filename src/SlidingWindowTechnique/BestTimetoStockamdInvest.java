package SlidingWindowTechnique;

public class BestTimetoStockamdInvest {
    public static void main(String[] args) {
        int []ar={1,2,4,2,5,7,2,4,9,0,9};
        System.out.println(besttime(ar));
        System.out.println(besttimeoptimal(ar));
    }

    private static int besttimeoptimal(int[] ar) {
        int l=0,r=1;
        int max=0;

        while(r<ar.length){
            if(ar[r]>ar[l]) {
                int profit = ar[r] - ar[l];
                max=Math.max(max,profit);
            }
            else
                l=r;

            r++;
        }
        return max;
    }

    private static int besttime(int[] ar) {
        int max=0;
        for(int i=0;i<ar.length-1;i++){
            for (int j=i+1;j<ar.length;j++){
                int sum=ar[j]-ar[i];

                if(sum>0)
                    max=Math.max(max,sum);
            }
        }
        return max;
    }
}
