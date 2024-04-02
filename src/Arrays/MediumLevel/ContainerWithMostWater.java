package Arrays.MediumLevel;
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//Return the maximum amount of water a container can store.
//
//Notice that you may not slant the container.
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(area(height));
    }

    //brute force method, time complexity will be o(n^2)
    private static int area(int[] height) {
        int res=0;

        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int area=(j-i)*Math.min(height[j],height[i]);
                res=Math.max(area,res);
            }
        }
        return res;
    }
}
