package Strings;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        s=s.trim();
        String temp="";
        String reverse[]=s.split(" ");
        for(int i=reverse.length-1;i>=0;i--){
           if(!reverse[i].equals("")){
               temp+=reverse[i]+" ";
           }
        }
        return temp.substring(0,temp.length()-1);
    }
}
