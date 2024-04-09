package DesignStructures;

public class LinkedList {

    Node head;
    Node tail;
    int size=0;

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    private void addFist(int data) {
        Node new_node=new Node(data);
        if(size==0||this.head==null){
            this.head=new_node;
            this.tail=new_node;
        }else{
            new_node.next=this.head;
            this.head=new_node;
        }
        size++;
    }

    private void printlist() {
        Node node=this.head;
        while(node!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
    }


    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.addFist(4);
        list.addFist(5);
        list.printlist();
    }




}
