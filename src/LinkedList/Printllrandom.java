package LinkedList;

import java.util.*;

public class Printllrandom {
    static class Node{
        int data;
        Node next;
        Node random;
        Node(int d){
            data=d;
            next=null;
            random=null;
        }
    }
    public static Node printnewll(Node head){
               //first crete list copy with original list.
        Node temp=head;
        while(temp!=null){
            Node newnode=new Node(temp.data);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
        }
        //to assign random pointers for newnode.
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
            temp.next.random=temp.random.next;
            }
            else{
                temp.next.random=null;
            }
            temp=temp.next.next;
        }
        //now you need to seperate them.
        Node tempnew=new Node(0);
        Node newhead=tempnew;
        Node tempold=head;
        while(tempold!=null){
           tempnew.next = tempold.next; // Connect the new copied nodes.
        tempold.next = tempold.next.next; // Separate the original nodes.
        tempnew = tempnew.next; // Move tempnew to the next copied node.
        tempold = tempold.next; // Move tempold to the next original node.
        }
        return newhead.next;
    }
   
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
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
    public static void main(String[] args) {
        Node head1=buildLinkedList();
        Node head2=buildLinkedList();
        printLinkedList(head1);
        printLinkedList(head2);
    }
}

 