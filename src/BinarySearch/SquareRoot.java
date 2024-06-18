package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int num=8;
        System.out.println(squareroot(num));
    }

    private static int squareroot(int num) {
        int left=0,right=num,ans=0;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(num/mid==mid)return mid;
            else if(num/mid<mid)right=mid-1;
            else{ left=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
