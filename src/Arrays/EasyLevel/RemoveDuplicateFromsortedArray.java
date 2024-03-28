package Arrays.EasyLevel;

public class RemoveDuplicateFromsortedArray {
    public static void main(String[] args) {
        int ar[]={1,1,2};
        int k=removeDuplicate(ar);
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    private static int removeDuplicate(int[] ar) {
       int pointer=1;

       for(int i=1;i<ar.length;i++){
           if(ar[i]!=ar[i-1])
               ar[pointer++]=ar[i];
       }
       return pointer;
    }
}
