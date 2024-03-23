package DesignStructures;

public class PriorityQueque {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.enqueue(10, 2);
        pq.enqueue(14, 4);
        pq.enqueue(16, 4);
        pq.enqueue(12, 3);
        int ind = pq.peek();

        System.out.println(pq.pr[ind].value);

        // Dequeue the top element
        pq.dequeue();

        // Check the top element
        ind = pq.peek();
        System.out.println(pq.pr[ind].value);

        // Dequeue the top element
        pq.dequeue();

        // Check the top element
        ind = pq.peek();
        System.out.println(pq.pr[ind].value);
    }
}

class item{
    int value;
    int priority;
}
class PriorityQueue{
    public item pr[];
    int size;
    PriorityQueue(){
        this.pr=new item[100000];
        this.size=-1;
    }
    public void enqueue(int value,int priority){
        size++;
        pr[size]=new item();
        pr[size].value=value;
        pr[size].priority=priority;
    }
    public int peek(){
        int highestpriority= Integer.MIN_VALUE;
        int index=-1;

        for(int i=0;i<=size;i++){
            if(highestpriority==pr[i].priority && i>-1 && pr[index].value <pr[i].value){
                highestpriority=pr[i].priority;
                index=i;
            }
            else if(highestpriority < pr[i].priority) {
                highestpriority=pr[i].priority;
                index=i;
            }
        }
        return index;

    }
    public void dequeue(){
        int index=peek();

        for(int i=index;i<size;i++){
            pr[i]=pr[i+1];
        }
        size--;
    }
}
