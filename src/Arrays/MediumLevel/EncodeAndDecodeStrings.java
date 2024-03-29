package Arrays.MediumLevel;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
       List<String >list=new ArrayList<>();
       list.add("we");
       list.add("say");
       list.add(":");
       list.add("yes");
       list.add("!@#$%^&*()");

        String encode=encodeString(list);
        System.out.println(encode);

        List<String>list1=decode(encode);
        System.out.println(list1);
    }

    private static List<String> decode(String encode) {
        List<String>list=new ArrayList<>();
        int i=0;
        while(i<encode.length()){
            int slice=encode.indexOf('#',i);
            int stringlength=Integer.parseInt(encode.substring(i,slice));
            String originalString=encode.substring(slice+1,slice+stringlength+1);
            list.add(originalString);
            i=slice+stringlength+1;
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
