package LinkedList;

import java.util.Scanner;

public class Reversegroup {
    static int count=1;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static Node Reverse(Node head,int k){
        Node cur=head;
        Node prev=null;
        Node next=null;
        int i=0;
        if(count<k){
            return head;
        }
        for(i=0;i<k;i++){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        count-=k;
        head.next=Reverse(next,k);
        return prev;
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
        System.out.println("Enter nth term you need to delete");
        int n=sc.nextInt();
        Node ans=Reverse(head1,n);
        printLinkedList(ans);
    }
}
