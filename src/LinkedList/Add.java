package LinkedList;

import java.util.*;

public class Add {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
   public static Node Addlist(Node h1,Node h2){
    Node i=h1;
    Node j=h2;

    // if(h1.data<=h2.data){
    //     j=h1;
    //     i=h2;
    // }
    int sum=0;
    sum=(h1.data+h2.data)%10;
    
    Node head3=new Node(sum);
    Node current=head3;
    int carry=(h1.data+h2.data)/10;
    System.out.println("going inside while loop");
    i=i.next;
    j=j!=null?j.next:null;
    while(i!=null){
        int idata=i.data;
        int jdata=j!=null?j.data:0;
        sum=(idata+jdata+carry)%10;
        carry=(idata+jdata+carry)/10;
        current.next=new Node(sum);
        current=current.next;
        i=i.next;
         j=j!=null?j.next:null;
        if(i==null){
            current.next=new Node(carry);
            current=current.next;
        }
        // System.out.println(i.data+" "+j.data);
    }
    System.out.println("outside while loop");
    return head3;
   }
//    public static Node builddynamicnode(){

//    }
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
        Node ans=Addlist(head1,head2);
        printLinkedList(ans);
    }
}
