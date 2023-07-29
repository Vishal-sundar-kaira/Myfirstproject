package Stacks;

import java.util.*;

public class Nextgreater {
    static int n;
    static int [] a;
    public  Nextgreater(int size){
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
    public static int[] nextGreaterElement(int[] arr, int n) {
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[n];
        for(int i=n*2-1;i>0;i--){
            while(!st.isEmpty()&&arr[i%n]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(arr[i%n]);
                nge[i%n]=-1;
                continue;
            }
            int p=arr[i%n];
            nge[i%n]=st.peek();
            st.push(p);
        }
        return nge;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Nextgreater ng=new Nextgreater(n);
        System.out.println("Enter elements");
        arrayinput(n);
        displayarray(n);
        int[] ans=nextGreaterElement(a, n);
        System.out.println("\n");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
// Input: N = 11, A[] = {3,10,4,2,1,2,6,1,7,2,9}

// Output: 10,-1,6,6,2,6,7,7,9,9,10
