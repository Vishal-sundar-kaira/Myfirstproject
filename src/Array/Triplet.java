package Array;

import java.util.HashSet;
import java.util.Scanner;

public class Triplet {
    static int n;
    static int a[];
    public Triplet(int ni) {
        n = ni;
        a = new int[n];
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
    public static void findtriplet(int k){
        for(int i=0;i<n-2;i++){
            HashSet<Integer> h=new HashSet<>();
            int currentsum=k-a[i];
            for(int j=i+1;j<n;j++){
                if(h.contains(currentsum-a[j])){
                    System.out.println("Triplet is"+a[i]+","+a[j]+","+(currentsum-a[j]));
                }
                h.add(a[j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Triplet t=new Triplet(n);
        System.out.println("Enter elements of an array");
        arrayinput();
        displayarray();
        System.out.println("Enter sum you need");
        int k=sc.nextInt();
        findtriplet(k);

    }
}
