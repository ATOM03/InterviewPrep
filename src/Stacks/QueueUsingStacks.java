package Stacks;

import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        QuequeWithEnqueueEfficient queque=new QuequeWithEnqueueEfficient();

        queque.enqueue(1);
        queque.enqueue(2);
        queque.enqueue(3);

        System.out.println(queque.dequeue());
        System.out.println(queque.dequeue());
        System.out.println(queque.dequeue());
        System.out.println(queque.dequeue());
    }
}

class QueuewithdequeueEfficient{
    Stack<Integer>stack1=new Stack<>();
    Stack<Integer>stack2=new Stack<>();


    public void enqueue(int data){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(data);

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public Integer dequeue(){
        if(!stack1.isEmpty()) {
            return stack1.pop();
        }
        return -1;
    }
}

class QuequeWithEnqueueEfficient{
    Stack<Integer>stack1=new Stack<>();
    Stack<Integer>stack2=new Stack<>();

    public void enqueue(int data){
        stack1.push(data);
    }

    public int dequeue(){
        int x;
        if(stack2.isEmpty()){
           while(!stack1.isEmpty()){
             x=stack1.pop();
             stack2.push(x);
           }
        }
        if(stack1.isEmpty() && stack2.isEmpty())
            return -1;
        x=stack2.pop();
       return x;
    }

}
