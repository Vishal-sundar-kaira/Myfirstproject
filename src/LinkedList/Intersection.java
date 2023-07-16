package LinkedList;

import java.util.*;

public class Intersection {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
   public static Node intersect(Node h1,Node h2){
    if(h1==null||h2==null){
        return null;
    }
    Node d1=h1;
    Node d2=h2;
    while(d1!=d2){
        d1=d1==null?h2:d1.next;
        d2=d2==null?h1:d2.next;
    }
    return d1;
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
        if(current==null){
            System.out.println("null");
        }
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
        Node ans=intersect(head1,head2);
        printLinkedList(ans);
    }
}
