package Array;

import java.util.*;

public class Choclate {
    static int n;
    static int a[];
    public Choclate(int ni) {
        n = ni;
        a = new int[n];
    }
    public static int minchoclate(int m){
        if(m==0||n==0){
            return -1;
        }
        if(m>n){
            return -1;
        }
        Arrays.sort(a);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            mindiff=Math.min(mindiff,a[i+m-1]-a[i]);
        }
        return mindiff;
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Choclate sp=new Choclate(n);
        System.out.println("Enter elements of an array");
        arrayinput();
        displayarray();
        System.out.println("Enter numbers of an student");
        int m=sc.nextInt();
        System.out.println(minchoclate(m));
    }
}
