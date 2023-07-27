package Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queuetostack {
    public static void display(Queue<Integer> a){
        System.out.println(a);
    }
    public static void push(Queue<Integer>a,int val){
        a.add(val);
        for(int i=0;i<a.size()-1;i++){
            a.add(a.remove());
        }
        display(a);
    }
    public static int pop(Queue<Integer> a){
        int x=a.peek();
        a.remove();
        return x;
    }
    public static int peek(Queue<Integer> a){
        return a.peek();
    }
    public static int size(Queue<Integer> a){
        return a.size();
    }
    public static void main(String[] args) {
        Queue <Integer> a=new LinkedList<>();
        Scanner sc =new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter function you need to perform 1.push 2.pop 3.top 4.size");
            x=sc.nextInt();
            switch (x) {
                case 1:
                System.out.println("Enter the value you need to add");
                int val=sc.nextInt();
                push(a,val);
                break;
                case 2:
                int p=pop(a);
                System.out.println(p);
                break;
                case 3:
                int pe=peek(a);
                System.out.println(pe);
                case 4:
                int s=size(a);
                System.out.println(s);
                default:
                    break;
            }
        }while(x!=5);

    }
}
