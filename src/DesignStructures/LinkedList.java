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

    private void addLast(int data) {
        Node node=new Node(data);
        if(size==0 || this.head==null)
            addFist(data);
        else{
            tail.next=node;
            this.tail=node;
            size++;
        }
    }
    private int sizeofLL(){
        return size;
    }
    private void printlist() {
        Node node=this.head;
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    private void deleteFirst(){
        if(size>1){
            this.head=head.next;
            size--;
        }
    }

    private void deleteLast(){
        Node end=this.head;
        Node prev=null;

        while(end.next!=null){
            prev=end;
            end=end.next;
        }
        prev.next=null;
        size--;
    }

    private void reverse() {
        Node prev=null;
        Node next=null;
        Node curr=this.head;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        this.head=prev;
    }
    private void mergeList(LinkedList list1, LinkedList list2) {
//        Node head1=list1.head;
//        Node head2=list2.head;
//
//        while(head1!=null || head2!=null){
//
//            if()
//        }


    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

//        list.addFist(4);
//        list.addFist(5);
//        list.addLast(6);
//        list.addFist(7);
//        list.addLast(8);
//        list.printlist();
//        list.deleteFirst();
//        list.printlist();
//        list.deleteLast();


        //Reverse a linklist
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(4);
//        list.addLast(5);
//        list.printlist();
//        list.reverse();
//        list.printlist();

        LinkedList merge=new LinkedList();
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);

        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);

        merge.mergeList(list1,list2);
        System.out.println(list.sizeofLL());
    }




}
