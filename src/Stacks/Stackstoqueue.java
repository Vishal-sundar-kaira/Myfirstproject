package Stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Stackstoqueue {
    public static void display(Stack<Integer>s1,Stack<Integer>s2){
        System.out.println(s1+""+s2);
    }
    public static void push(Stack<Integer>in,int val){
        in.push(val);
    }
    public static int pop(Stack<Integer> in,Stack<Integer>out){
        int x;
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.peek());
                in.pop();
            }
            x=out.peek();
            out.pop();
        }
        else{
            x=out.peek();
            out.pop();
        }
        return x;
    }
    public static int peek(Stack<Integer> in,Stack<Integer>out){
        int x;
        if(out.isEmpty()){
            while(!in.isEmpty()){
                out.push(in.peek());
                in.pop();
            }
            x=out.peek();
        }
        else{
            x=out.peek();
        }
        return x;
    }
    public static int size(Stack<Integer> in,Stack<Integer>out){
        return in.size()+out.size();
    }
    public static void main(String[] args) {
        Stack <Integer> input=new Stack<>();
        Stack<Integer> output=new Stack<>();
        Scanner sc =new Scanner(System.in);
        int x;
        do{
            System.out.println("Enter function you need to perform 1.push 2.pop 3.top 4.size");
            x=sc.nextInt();
            switch (x) {
                case 1:
                System.out.println("Enter the value you need to add");
                int val=sc.nextInt();
                push(input,val);
                display(input, output);
                break;
                case 2:
                int p=pop(input,output);
                System.out.println(p);
                break;
                case 3:
                int pe=peek(input,output);
                System.out.println(pe);
                case 4:
                int s=size(input,output);
                System.out.println(s);
                default:
                    break;
            }
        }while(x!=5);

    }
}
