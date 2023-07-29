package Array;

import java.util.*;

public class Arraysample {
    static int n;
    static int [] a;
    public  Arraysample(int size){
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
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        arrayinput(n);
    }
}
