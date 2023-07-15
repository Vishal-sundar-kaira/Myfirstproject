package LinkedList;

import java.util.*;

public class Deletegivennode {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static Node delete(Node head,int n){
        //n from back=(total-n(from start));
        Node front=head.next;
        Node i=head;
        Node back=i;
        if(head.data==n){
            head=head.next;
            return head;
        }
        while(front!=null){
            if(i.data==n){
                back.next=front;
                return head;
            }
            else{
                back=i;
                front=front.next;
                i=i.next;


            }
        }
        return head;
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
        Scanner sc=new Scanner(System.in);
        Node head1=buildLinkedList();
        System.out.println("Enter node you need to delete");
        int n=sc.nextInt();
        Node ans=delete(head1,n);
        printLinkedList(ans);
    }
}
