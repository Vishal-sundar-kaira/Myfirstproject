package LinkedList;

import java.util.*;

public class Mergelist {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static Node merge(Node h1,Node h2){
        if(h1==null){
            return h2;
        }
        if(h2==null){
            return h1;
        }
        Node temp=null;
        Node stemp;
        Node l1;
        Node l2;
        if(h2.data>h1.data){
            l1=h1;
            l2=h2;
        }
        else{
            l1=h2;
            l2=h1;
        }
        Node res=l1;
        while(l1!=null&&l2!=null){
            while(l1 != null && l1.data <= l2.data) {

                temp = l1;//storing last sorted node  
                l1 = l1.next;
            }
            temp.next=l2;
            stemp=l1;
            l1=l2;
            l2=stemp;
        }
        return res;
    }
    public static Node buildLinkedList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first element");
        int initial=sc.nextInt();
        Node start = new Node(initial);
        Node current = start;

        // System.out.print("Enter the number of elements: ");
        // int n = scanner.nextInt();

        System.out.print("Enter rest elements: ");
        int data=sc.nextInt();
        while(data!=-1) {
            current.next = new Node(data);
            current = current.next;
            data = sc.nextInt();
        }

        return start;
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1=buildLinkedList();
        Node head2=buildLinkedList();
        printLinkedList(head1);
        printLinkedList(head2);
        Node ans=merge(head1,head2);
        printLinkedList(ans);
    }
}
