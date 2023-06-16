package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Practiceduplicate {
    static int n;
    static int a[];
    public Practiceduplicate(int ni) {
        n = ni;
        a = new int[n];
    }
    public static void findduplicate(){
        int count=0;
        int index=0;
        HashSet<Integer> h=new HashSet<>(n);
        for(int i=0;i<n;i++){
            a[i]=a[i]+1;//increase by 1;
        }
        for(int i=0;i<n;i++){
            index=a[i]>n?Math.abs(a[i]/(n+1)):Math.abs(a[i]);
            if(a[i]==n){
                count++;
                continue;
            }
            int value=a[index];
            if(value<0){
                h.add(index-1);
            }
            else if(value>n){
                continue;
            }
            else{
                a[index]=-a[index];
            }
        }
        if(count>1){
            h.add(n-1);
            a[index]=Math.abs(a[index])*(n+1);
        }
        System.out.println(h);
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
        Practiceduplicate p=new Practiceduplicate(n);
        arrayinput();
        displayarray();
        findduplicate();
    }
}
