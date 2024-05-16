package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="[(])";
        System.out.println(validparentheses(s));
    }

    private static boolean validparentheses(String s) {
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='[' || ch=='{'|| ch=='('){
                if(ch=='[')
                    stack.push(']');
                else if(ch=='{')
                    stack.push('}');
                else stack.push(')');
            }

            else if(ch==']' || ch=='}'|| ch==')'){
                if(stack.isEmpty()){
                    return false;
                }
                else {
                    char temp = stack.pop();
                    if (temp != ch)
                        return false;
                }
            }
        }

        if(stack.isEmpty())
            return true;
        return false;

    }
}
