package Stacks;

import java.util.Scanner;

public class Queuearray {
    static int front=-1;
    static int end=-1;
    public static void display(int[]a){
        for(int i=front;i<=end;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
    }
    public static void push(int[]a,int val){
        if(front==-1&&end==-1){
            front++;
            end++;
        }
        else{
            end++;
        }
        a[end]=val;
        display(a);
    }
    public static int pop(int[]a){
        if(front==-1&&end==-1){
            return -1;
        }
        int x=a[front];
        front++;
        return x;
    }
    public static int peek(int[]a){
        return a[front];
    }
    public static int size(int[]a){
        return end-front+1;
    }
    public static void main(String[] args) {
        int[]a=new int[1000];
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
