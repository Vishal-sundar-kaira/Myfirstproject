package LinkedList;

import java.util.Scanner;

public class Flattening {
    static int count=1;
    static class Node{
        int data;
        Node next;
        Node bottom;
        Node(int d){
            data=d;
            next=null;
            bottom=null;
        }
    }
    Node merge(Node a,Node b){
        Node dummy=new Node(0);
        Node head=dummy;
        while(a!=null&&b!=null){
            if(a.data<b.data){
                dummy.bottom=a;
                dummy=a;
                a=a.bottom;
            }
            else{
                dummy.bottom=b;
                dummy=b;
                b=b.bottom;
            }
        }
        if(a==null)dummy.bottom=b;
        else dummy.bottom=a;
        return head.bottom;
    }
    Node flatten(Node root)
    {
        if(root.next==null){
            return root;
        }
        root.next=flatten(root.next);
        root=merge(root,root.next);
        return root;
    }
    public static Node buildLinkedList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first element");
        int initial=sc.nextInt();
        Node start = new Node(initial);
        Node current = start;

        System.out.print("Enter rest elements: ");
        int data=sc.nextInt();
        while(data!=-1) {
            current.next = new Node(data);
            current = current.next;
            count++;
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
        Scanner sc=new Scanner(System.in);
        Node head1=buildLinkedList();
        // Flat(head1);
    }
}
