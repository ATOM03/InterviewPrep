package Arrays.MediumLevel;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
       List<String >list=new ArrayList<>();
       list.add("neet");
       list.add("code");
       list.add("love");
       list.add("you");

        String encode=encodeString(list);
        System.out.println(encode);

        List<String>list1=decode(encode);
        System.out.println(list1);
    }

    private static List<String> decode(String encode) {
        List<String>list=new ArrayList<>();

        while(encode.length()!=0){
            int stringlength=Integer.parseInt(encode.charAt(0)+"");
            if(encode.charAt(1)=='#'){
                String originalString=encode.substring(2,2+stringlength);
                list.add(originalString);
            }
            encode=encode.substring(stringlength+2);
        }

        return list;

    }

    public static String encodeString(List<String> s){
        String encode="";

        for(int i=0;i<s.size();i++){
            int length=s.get(i).length();
            String temp=length+"#"+s.get(i);
            encode+=temp;
        }
        return encode;
    }

}
