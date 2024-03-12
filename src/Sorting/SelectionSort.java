package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int ar[]={65,24,12,25,11};
        for(int i=0;i<ar.length-1;i++ ){
            int min_indx=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[min_indx])
                    min_indx=j;
            }
            int temp=ar[i];
            ar[i]=ar[min_indx];
            ar[min_indx]=temp;
        }

        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+",");
    }
}
