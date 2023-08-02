package Stacks;

import java.util.*;

public class Minstack {
    static int min=Integer.MAX_VALUE;
    public static void push(Stack<Integer> s,int val){
        if(s.isEmpty()){
            min=val;
        }
        if(val<min){
            int newmin=val;
            val=2*val-min;
            min=newmin;
        }
        s.push(val);
    }
    public static void pop(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        if(top<min){
            min=2*min-top;
        }
    }
    public static int peek(Stack<Integer> s){
        int tp=s.peek();
        if(tp<min){
            tp=min;
        }
        return tp;
    }
    public static int getmin(){
        return min;
    }
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        Scanner sc =new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter function you need to perform 1.push 2.pop 3.peek 4.getmin");
            x=sc.nextInt();
            switch (x) {
                case 1:
                System.out.println("Enter the value you need to add");
                int val=sc.nextInt();
                push(s,val);
                break;
                case 2:
                pop(s);
                break;
                case 3:
                int pe=peek(s);
                System.out.println(pe);
                case 4:
                int m=getmin();
                System.out.println(m);
                default:
                    break;
            }
        }while(x!=5);
    }
}
