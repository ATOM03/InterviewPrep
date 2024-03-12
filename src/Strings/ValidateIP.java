package Strings;

public class ValidateIP {
    public static void main(String[] args) {
        String query="2001:0db8:85a3:00000:0:8A2E:0370:7334";
        System.out.println(validateIp(query));
    }

    private static String validateIp(String query) {
        char ch[] = query.toCharArray();
        int semicount = 0, coloncount = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '.') {
                semicount++;
            } else if (ch[i] == ':') {
                coloncount++;
            }
        }
        if (semicount == 3) {
            return validateIPv4(query);
        } else if (coloncount == 7) {
            return validateIPv6(query);
        }
        else{
            return "Neither";
        }
    }


    private static String validateIPv6(String query) {
        String temp[] = query.split(":",-1);
        String hexidecimal = "0123456789abcdefABCDEF";
        if (temp.length == 8) {
            for (int i = 0; i < temp.length; i++) {
                String temp1 = temp[i];
                if(temp1.length()>0 && temp1.length()<=4) {
                    for (Character ch : temp1.toCharArray()) {
                        if (hexidecimal.indexOf(ch) == -1)
                            return "Neither";
                    }
                }
                else{
                    return "Neither";
                }
            }
            return "IPv6";

        } else {
            return "Neither";
        }
    }

    private static String validateIPv4(String query) {
        //split(".") wont work here that why we have use it in a special character
        String s[]=query.split("[.]",-1);
        for(String x:s){
            if(x.length()==0||x.length()>3)
                return "Neither";
            if(x.charAt(0)=='0'&& x.length()!=1)
                return "Neither";
            for(char ch:x.toCharArray())
                if(!Character.isDigit(ch))
                    return "Neither";
            if(Integer.parseInt(x)>255)
                return "Neither";
        }
        return "IPv4";
    }
}
