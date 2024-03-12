package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int ar[]={4,3,12,5,6,11,2};
        int n=ar.length;
        for(int i=1;i<n;i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+",");
    }
}
