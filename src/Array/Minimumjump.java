package Array;

import java.util.Scanner;

public class Minimumjump {
    static int[] a;
    static int n;
    public Minimumjump(int size){
        n=size;
        a=new int[n];
    }
    public static int minjump(){
        if(a.length==1){
            return 0;
        }
        if(a[0]==0){
            return -1;
        }
        int maxreach=a[0];
        int step=a[0];
        int jump=1;
        for(int i=1;i<n;i++){
            if(i==a.length-1){
                return jump;
            }
            if(a[i]>=(a.length-1)-i){
                return jump+1;
            }
            maxreach=Math.max(maxreach, a[i]+i);
            step--;
            if(step==0){
                jump++;
                if(i>=maxreach){//this is to check if there is 0 or no moving further.
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Minimumjump mj=new Minimumjump(n);
        arrayinput();
        displayarray();
        int ans=minjump();
        System.out.println(ans);


    }
}
