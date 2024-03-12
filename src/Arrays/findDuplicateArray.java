package Arrays;

public class findDuplicateArray {
        public static void main(String[] args) {
            int ar[]=new int[]{3,1,3,4,2};
            System.out.println(findDuplicateArray(ar));
            System.exit(0);
        }
        public static int findDuplicateArray(int ar[]){
            //detect cylce in the array as the constraints shows that there will be a cycle in the array which means it can be tranvered infintly.
            int slow=ar[0];
            int fast=ar[0];
            do{
                slow=ar[slow];
                fast=ar[ar[fast]];
            }while(slow!=fast);
            int point1=ar[0];
            int point2=slow;
            //find the interaction point
            while(point1!=point2){
                point1=ar[point1];
                point2=ar[point2];
            }
            return point1;
        }

}
