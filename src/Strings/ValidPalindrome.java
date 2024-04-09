package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s="0P";
        System.out.println(isvalidPalindrome(s));
    }

    private static boolean isvalidPalindrome(String s) {
        boolean flag=true;
        String newS="";

        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || Character.isLetterOrDigit(ch))
                newS+=ch;
        }
        newS=newS.toLowerCase();

        int i=0,j=newS.length()-1;
        while(i<j){
            if(newS.charAt(i)!=newS.charAt(j)){
               return false;
            }
            i++;
            j--;
        }
        return flag;
    }
}
