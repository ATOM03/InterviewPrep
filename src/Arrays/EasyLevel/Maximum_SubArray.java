package Arrays.EasyLevel;

public class Maximum_SubArray {
    public static void main(String[] args) {
        int ar[]={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubarray(ar));
    }

    private static int maxSubarray(int[] ar) {
        int n= ar.length;
        int max_so_far=Integer.MIN_VALUE;
        int max_sum=0;

        for(int i =0;i<n;i++){
            max_sum+=ar[i];
            if(max_so_far<max_sum)
                max_so_far=Math.max(max_sum,max_so_far);
            if(max_sum<0)
                max_sum=0;
        }
        return max_so_far;
    }
}
