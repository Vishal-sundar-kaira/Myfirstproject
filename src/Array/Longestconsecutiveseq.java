package Array;
import java.util.*;

import java.util.Scanner;

public class Longestconsecutiveseq {
        static int n;
    static int a[];
    public Longestconsecutiveseq(int ni) {
        n = ni;
        a = new int[n];
    }
    public static void lcs(){
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int i=0;i<n;i++){//first add everythings in hashset
            hash.add(a[i]);
        }
        int longest=0;
        for(int h:hash){
            if(!hash.contains(h-1)){
                int currenthigh=1;
                int num=h;
                while(hash.contains(num+1)){
                    num=num+1;
                    currenthigh+=1;
                }
                longest=Math.max(currenthigh,longest);
            }
        }
        System.out.println(longest);
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
        Longestconsecutiveseq sp=new Longestconsecutiveseq(n);
        System.out.println("Enter elements of an array");
        arrayinput();
        displayarray();
        lcs();
    }
}
