package Arrays.EasyLevel;

//You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once.
//
//Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
//Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
public class SegregateArrays {
    public static void main(String[] args) {
        int ar[]={0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregateArray(ar);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        //using the 3 pointer method using low, mid and high pointer
       // https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/

        int ar1[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        segregateArray1(ar1);
        for (int i = 0; i <ar1.length ; i++) {
            System.out.print(ar1[i]+" ");
        }
    }

    private static void segregateArray1(int[] ar) {
        int low=0,mid=0,high=ar.length-1;
        int temp;

        while(mid<=high){
            switch (ar[mid]){
                case 0: {
                    temp = ar[low];
                    ar[low] = ar[mid];
                    ar[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=ar[mid];
                    ar[mid]=ar[high];
                    ar[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }

    private static void segregateArray(int[] ar) {
        int left=0,right=ar.length-1;
        while(left <right){

            while(ar[left]==0 && left<right)
                left++;
            while (ar[right]==1 && left<right)
                right--;
            if (left<right) {
                ar[left] = 0;
                ar[right]=1;
                left++;
                right--;
            }

        }
    }
}
