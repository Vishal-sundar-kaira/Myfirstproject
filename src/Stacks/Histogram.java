package Stacks;

import java.util.*;

import Array.Arrayofcolor;

public class Histogram {
    static int n;
    static int [] a;
    public  Histogram(int size){
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
    public static int maxarea(){
        int[] leftsmall=new int[n];
        int[] rightsmall=new int[n];
        Stack<Integer> s= new Stack<>();
        //left small
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&a[i]<=a[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                leftsmall[i]=0;
            }
            else{
                leftsmall[i]=s.peek()+1;
            }
            s.push(i);
        }
        
        while(!s.empty()){
            s.pop();
        }
        //right small;
        for(int i=n-1;i>0;i--){
            while(!s.isEmpty()&&a[i]<=a[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                rightsmall[i]=n-1;
            }
            else{
                rightsmall[i]=s.peek()-1;
            }
            s.push(i);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,a[i]*(rightsmall[i]-leftsmall[i]+1));
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Histogram H=new Histogram(n);
        arrayinput(n);
        displayarray(n);
        int ans=maxarea();
        System.out.println("/n");
        System.out.println(ans);
    }
}
