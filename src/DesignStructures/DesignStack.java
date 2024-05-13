package DesignStructures;

import java.util.ArrayList;

public class DesignStack {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printstack();

        stack.pop();

        stack.printstack();
    }
}

class Stack{
    ArrayList<Integer>stack;
    int size=-1;

    Stack(){
        this.stack=new ArrayList<>();
    }

    public void push(int a){
        this.stack.add(a);
        size++;
    }
    public int pop(){

        if(size<0){
            return -1;
        }

        int temp=stack.get(size);
        stack.remove(size);
        size--;
        return temp;
    }

    public int top(){
        return stack.get(size);
    }
    public void printstack(){
        for(int i=size;i>=0;i--){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
    }
}
