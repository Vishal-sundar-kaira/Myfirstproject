package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Slidingwindow {
    static int n;
    static int [] a;
    public  Slidingwindow(int size){
        n=size;
        a=new int[n];
    }
    public static void arrayinput(int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    static void displayarray(int n)
    {
        // Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static void slide(int k){
        int[] Out=new int[n];
        int O=0;
        Deque<Integer> d=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            //to remove out of range index.
            if(!d.isEmpty()&&d.peek()==i-k){
                d.poll();
            }
            while(!d.isEmpty()&&a[d.peekLast()]<a[i]){
                d.pollLast();
            }
            d.offer(i);
            if(i>=k-1){
                Out[O++]=a[d.peek()];
            }
        }
        for(int i=0;i<O;i++){
            System.out.println(Out[O]);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Slidingwindow s=new Slidingwindow(n);
        arrayinput(n);
        displayarray(n);
        System.out.println("Enter k value");
        int k=sc.nextInt();
        slide(k);
    }
}
