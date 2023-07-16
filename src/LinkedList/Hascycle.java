package LinkedList;

import java.util.*;

public class Hascycle {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
   public static boolean cycle(Node h1){
    if(h1==null){
        return false;
    }
    Node fast=h1;
    Node slow=h1;

    while(fast.next!=null&&fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
            return true;
        }
    }
    return false;
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
        printLinkedList(head1);
        boolean ans=cycle(head1);
        System.out.println(ans);
    }
}
