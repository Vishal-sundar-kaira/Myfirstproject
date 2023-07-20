package LinkedList;

import java.util.Scanner;

public class Linkpalindrome {
    static int count=1;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static Node Reverse(Node head){
        Node cur=head;
        Node next=null;
        Node prev=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public static boolean palindrome(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("fast completed");
        slow.next=Reverse(slow.next);
        slow=slow.next;
        Node dummy=head;
        printLinkedList(head);
        while(slow!=null){
            if(slow.data!=dummy.data){
                return false;
            }
            slow=slow.next;
            dummy=dummy.next;
        }
        return true;
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
        boolean ans=palindrome(head1);
        System.out.println(ans);
    }
}
