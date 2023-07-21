package LinkedList;

import java.util.Scanner;

public class Rotatektime {
    static int count=1;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static Node rotateRight(Node head, int k) {
        if(head==null||head.next==null){
            return head;
        }
            Node temp=head;
            int length=1;
            while(temp.next!=null){
                length++;
                temp=temp.next;
            }
            temp.next=head;
            k=k%length;
            int end=length-k;
                while(end!=0){
                    end--;
                    temp=temp.next;
                }
                head=temp.next;
                temp.next=null;
        return head;
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
        System.out.println("Enter k");
        int k=sc.nextInt();
        Node ans=rotateRight(head1,k);
        printLinkedList(ans);
    }
}

