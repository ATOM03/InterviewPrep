package Arrays.EasyLevel;

public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        if(n<0)
            return false;

        int temp=n;
        int reverse=0;

        while(temp!=0){
            int digit=(int)temp%10;
            reverse=reverse*10+digit;
            temp=temp/10;
        }
        return (reverse==n);
    }
}
