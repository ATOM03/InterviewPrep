package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        char[]ch={'h','e','l','l','o'};

        reverseString(ch);
        for (int i = 0; i <ch.length ; i++) {
            System.out.print(ch[i]+" ");
        }
    }

    private static void reverseString(char[] s) {

        for(int i=0;i<s.length/2;i++) {
            char temp=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=temp;
        }

    }
}
