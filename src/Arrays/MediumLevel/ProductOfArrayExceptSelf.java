package Arrays.MediumLevel;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]

//https://leetcode.com/problems/product-of-array-except-self/description/

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int ar[]={-1,1,0,-3,3};
        int product[]=productofarrayexceptself(ar);
        for (int i=0;i<product.length;i++)
            System.out.print(product[i]+" ");
    }

    private static int[] productofarrayexceptself(int[] ar) {
        int n =ar.length;

        int prefixSum[]=new int[n];
        int suffixSum[]=new int[n];
        int result[]=new int[n];

        prefixSum[0]=1;
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]*ar[i-1];
        }
        suffixSum[n-1]=1;

        for (int i=n-2;i>=0;i--){
            suffixSum[i]=suffixSum[i+1]*ar[i+1];
        }
        for(int i=0;i<n;i++){
            result[i]=prefixSum[i]*suffixSum[i];
        }
        return result;
    }
}
