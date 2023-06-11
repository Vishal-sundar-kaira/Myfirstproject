package Array;

import java.util.*;

public class Negative {
    static int[] a;
    static int n;
    public Negative(int size){
        n=size;
        a=new int[n];
    }
    public static void negativesort(){
        int temp;
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
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
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        System.out.println("Enter array elements it should be both positive and negative");
        Negative negative=new Negative(n);
        arrayinput();
        displayarray();
        negativesort();
        displayarray();

    }
}
