package Array;

import java.util.Scanner;

public class Practicejump {
    static int n;
    static int a[];
    public Practicejump(int ni) {
        n = ni;
        a = new int[n];
    }
    public static int minjump(){
        int step=a[0];
        int jump=1;
        int maxreach=a[0];
        if(a[0]==0){
            return -1;
        }
        if(a[0]>=n){
            return jump;
        }
        for(int i=1;i<n;i++){
            if(a[i]==n){
                return jump;
            }
            if(a[i]>=(n-i-1)){
                return jump+1;
            }
                maxreach+=a[i];
                step--;
            if(step==0){
                jump++;
                if(i>maxreach){
                    return -1;
                }
                step=maxreach-i;
            }

        }
        return -1;
    }
    public static void arrayinput()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public static void displayarray()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        System.out.println("Enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Practicejump p=new Practicejump(n);
        arrayinput();
        displayarray();
        int ans =minjump();
        System.out.println("minimium jumps required is"+ans);
    }
}
