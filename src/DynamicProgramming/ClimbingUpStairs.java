package DynamicProgramming;

public class ClimbingUpStairs {
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbingup(n));
    }

    private static int climbingup(int n) {
        int ar[]=new int [n+1];
        ar[0]=1;
        ar[1]=2;

        for(int i=2;i<n;i++){
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar[n-1];
    }
}
