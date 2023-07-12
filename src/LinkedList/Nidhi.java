package LinkedList;
import java.util.Scanner;


public class Nidhi {
    static class Node
    {
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }

    }
    // static Node h1,h2;
    public static void create(Node head) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        int data = sc.nextInt();
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node currNode = head;
                while (currNode.next != null) {
                    currNode = currNode.next;
                }
                currNode.next = newNode;
                System.out.println("Enter next");
                data = sc.nextInt();
            }
        }
    }
    // public static Node merge(Node h1,Node h2){
    //     if(h1==null){
    //         return h2;
    //     }
    //     if(h2==null){
    //         return h1;
    //     }
    //     Node temp=null;
    //     Node stemp;
    //     Node l1;
    //     Node l2;
    //     if(h2.data>h1.data){
    //         l1=h1;
    //         l2=h2;
    //     }
    //     else{
    //         l1=h2;
    //         l2=h1;
    //     }
    //     Node res=l1;
    //     while(l1!=null&&l2!=null){
    //         while(l1 != null && l1.data <= l2.data) {

    //             temp = l1;//storing last sorted node  
    //             l1 = l1.next;
    //         }
    //         temp.next=l2;
    //         stemp=l1;
    //         l1=l2;
    //         l2=stemp;
    //     }
    //     return res;
    // }
    public static Node merge(Node h1, Node h2)
    {
        if(h1==null)
            return h2;

        if(h2==null)
            return h1;

        Node temp=null;
        Node tempSwap;
        Node l1;
        Node l2;

        if(h2.data<h1.data)
        {
            l1=h2;
            l2=h1;
        }
        else{
            l1=h1;
            l2=h2;
        }
        Node res=l1;
        System.out.println("while loop");
        while(l1!=null && l2!=null)
        {
            while(l1!=null && l1.data<= l2.data)
            {
                temp=l1;
                l1=l1.next;
            }
            System.out.println("coming out");
            temp.next=l2; //link break
            tempSwap=l1;
            l1=l2;
            l2=tempSwap;
        }
        System.out.println("while completed");
        return res;
    }
    public static void print(Node head)
    {
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
    }

    public static void main(String args[])
    {
        Nidhi ml=new Nidhi();
        Node h1=new Node(1);
        Node h2=new Node(2);
        ml.create(h1);
        ml.create(h2);
        ml.print(h1);
        System.out.println();
        ml.print(h2);
        Node ans=ml.merge(h1,h2);
        // System.out.println(ans);
        ml.print(ans);
    }

}