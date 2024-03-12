package Arrays;
//Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
//
//Note: If the array is increasing then just print the last element will be the maximum value.
//
//Example:
//
//Input: array[]= {5, 10, 20, 15}
//Output: 20
//Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
public class PeakElement {
    public static void main(String[] args) {
        int ar[]={ 1, 3, 20, 4, 1, 0 };
        System.out.println((ar[PeakElementInArray(ar)]));
    }
    public static int PeakElementInArray(int ar[]){
        if(ar.length==1)
            return 0;

        //First check whether we find the peak in the starting...
        if(ar[0]>=ar[1])
            return 0;
        //Then we check whether we find the peak in the end..
        if(ar[ar.length-1]>=ar[ar.length-2])
            return ar.length-1;

        for(int i=1;i<ar.length-1;i++){
            if(ar[i]>=ar[i-1] && ar[i]>=ar[i+1])
                return i;
        }
        return 0;
    }
}
