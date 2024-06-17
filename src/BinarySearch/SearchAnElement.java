package BinarySearch;

public class SearchAnElement {
    public static void main(String[] args) {
        int ar[]={1,2,3,5,6,9,18,35,36,38,41,43,44,45,50};
        System.out.println(searchanElement(ar,41));
    }

    private static int searchanElement(int[] ar, int i) {
        int left=0,right=ar.length-1;

        while(left<=right){
            int mid=(right+left)/2;

            if(i==ar[mid])
                return mid;
            else if(i>=ar[mid])
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}
