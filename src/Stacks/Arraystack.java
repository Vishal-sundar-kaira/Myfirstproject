package Stacks;

import java.util.Scanner;

public class Arraystack {
    static int top=-1;
    public static void push(int[]a,int val){
        top++;
        a[top]=val;
    }
    public static int pop(int[]a){
        int x=a[top];
        top--;
        return x;
    }
    public static int peek(int[]a){
        return a[top];
    }
    public static int size(int[]a){
        return top+1;
    }
    public static void main(String[] args) {
        int[]a=new int[1000];
        Scanner sc =new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter function you need to perform 1.push 2.pop 3.peek 4.size");
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
            for(int i=0;i<=top;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }while(x!=5);

    }
}
