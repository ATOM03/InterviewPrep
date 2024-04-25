package DesignStructures;

import java.util.List;

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
    private LinkedList mergeList(LinkedList list1, LinkedList list2) {
        Node head1=list1.head;
        Node head2=list2.head;

        LinkedList list=new LinkedList();


        while(head1!=null && head2!=null){

            if(head1.data<=head2.data){
                list.addLast(head1.data);
                head1=head1.next;
            }
            else{
                list.addLast(head2.data);
                head2=head2.next;
            }
        }

        while(head1!=null){
            list.addLast(head1.data);
            head1=head1.next;
        }

        while(head2!=null){
            list.addLast(head2.data);
            head2=head2.next;
        }
        return list;


    }
    public boolean hasCycle(Node head){
        Node slow=head;
        Node  fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
                return true;
        }
        return false;
    }
    private boolean ispalindrome() {
        Node slow=head;
        Node fast=head.next;

        //point is to go to the middle and then reverse the linklist from the middle and compare the starting values and middle(reverse list) values.
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //we got the middle node;
        slow=reverse(slow.next);
        fast=head;
        while(slow!=null && fast!=null){
            if(slow.data!=fast.data)
                return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }

    private Node reverse(Node head) {
        Node prev=null;
        Node next=null;
        Node curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    private void reorder() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
       Node second=slow.next;
        Node prev=slow.next=null;

        while(second!=null){
            Node temp=second.next;
            second.next=prev;
            prev=second;
            second=temp;
        }
        Node first=head;
        second=prev;

        while(second!=null){
            Node temp1=first.next;
            Node temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }

    }
    private void deleteNthNode(LinkedList list1, int i) {
     Node dummy=list1.head;
     Node left=dummy;
     Node right=list1.head;

     while(i>0){
         right=right.next;
         i--;
     }
     while(right!=null){
         left=left.next;
         right=right.next;
     }
     left.next=left.next.next;
    }
    private void deleteVal(LinkedList list1, int i) {
       Node dummy=new Node(0);
       Node curr=dummy;
       dummy.next=head;

       while(curr.next!=null){
           if(curr.next.data==i) curr.next=curr.next.next;
           else
               curr=curr.next;
       }
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

//        LinkedList list1=new LinkedList();
//        LinkedList list2=new LinkedList();
//        list1.addLast(1);
//        list1.addLast(2);
//        list1.addLast(4);
//
//        list2.addLast(1);
//        list2.addLast(3);
//        list2.addLast(4);
//
//        LinkedList merge=list1.mergeList(list1,list2);
//        merge.printlist();

//        LinkedList list1=new LinkedList();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(2);
//        list.addLast(1);
//
//        System.out.println(list.ispalindrome());
//
//        list.printlist();

//        LinkedList list1 =new LinkedList();
//        list1.addLast(1);
//        list1.addLast(2);
//        list1.addLast(3);
//        list1.addLast(4);
//        list1.addLast(5);
//
//        list1.printlist();
//        list1.reorder();

        LinkedList list1=new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(6);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);
//        list1.addLast(7);
//        list1.addLast(7);
//        list1.addLast(7);
//        list1.addLast(7);
        list1.printlist();

        list1.deleteVal(list1,6);
        list1.printlist();
//        list1.deleteNthNode(list1,3);




//        System.out.println(list.sizeofLL());
    }




}
