package Recursion;

public class SubsequenceOfString {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(subsequence(s));
    }

    private static int subsequence(String s) {
        return subsequence("",s);

    }

    private static int subsequence(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return 1;
        }
        char ch=unprocessed.charAt(0);
        int count=0;
        unprocessed=unprocessed.substring(1);
        count+=subsequence(processed,unprocessed);
        count+=subsequence(processed+ch,unprocessed);
        return count;
    }
}
