package Array;

import java.lang.Character.Subset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Subsetarray {
    static int n,m;
    static int a[];
    static int b[];
    public Subsetarray(int n1,int n2) {
        n = n1;
        m=n2;
        a = new int[n];
        b=new int[m];
    }
    public static void arrayinput(int[]arr,int size)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
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
    public static Boolean subset(){
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            h.put(a[i],h.getOrDefault(a[i], 0)+1);
        }
        for(int i=0;i<m;i++){
            if(h.getOrDefault(b[i],0)>0){
                h.put(b[i],h.get(b[i])-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array 1");
        int n=sc.nextInt();
        System.out.println("Enter size of an array 2");
        int m=sc.nextInt();
        Subsetarray sp=new Subsetarray(n,m);
        System.out.println("Enter elements of an array1");
        arrayinput(a,n);
        System.out.println("Enter elements of an array2");
        arrayinput(b, m);
        System.out.println(subset());
    }
}
