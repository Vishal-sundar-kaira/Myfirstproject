package LinkedList;
import java.util.*;
public class Middle {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static Node middle(Node head){
        Node tot=head;
        Node hare=head;
        while(hare!=null&&hare.next!=null){
            tot=tot.next;
            hare=hare.next.next;
        }
        return tot;
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
        Node head = buildLinkedList();
        // Node newNode=new Node();
        printLinkedList(head);
        Node mid=middle(head);
        printLinkedList(mid);
    }
}
