package Array;

import java.util.*;

public class Reverse {
    static void arrayinput(int n,int[] array)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
    }
    static void displayarray(int n,int[] array)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    static void reversearray(int start,int end,int[]array)
    {
        int temp;
        if(start>=end)
        {
            return;
        }
        temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        reversearray(start+1, end-1, array);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int[] array = new int[20];
        arrayinput(n,array);
        displayarray(n,array);
        reversearray(0,n-1,array);
        displayarray(n, array);
    }
}
