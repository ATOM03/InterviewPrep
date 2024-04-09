package Arrays.EasyLevel;


//Selection Sort
public class SortAnArray {
    public static void main(String[] args) {
        int ar[]={0,23,14,12,9};
        selectionSort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    private static void selectionSort(int[] ar) {
        for (int i = 0; i <ar.length-1 ; i++) {
            int min_index=i;

            for(int j=i+1;j<ar.length;j++){
                if(ar[j]<ar[min_index])
                    min_index=j;
            }
            int temp=ar[i];
            ar[i]=ar[min_index];
            ar[min_index]=temp;
        }
    }
}
