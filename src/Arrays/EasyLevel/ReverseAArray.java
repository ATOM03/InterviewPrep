package Arrays.EasyLevel;

public class ReverseAArray {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        reverse1(ar);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    //method1
    private static void reverse(int[] ar) {
        int num=ar.length;

        for(int i=0;i<num/2;i++){
            int temp=ar[i];
            ar[i]=ar[num-i-1];
            ar[num-i-1]=temp;
        }
    }

    //method2
    private static void reverse1(int[] ar) {
        int temp;
        int start=0;
        int end=ar.length-1;

        while(start<end){
            temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }

    //this problem can be solved via recursion also.


}
