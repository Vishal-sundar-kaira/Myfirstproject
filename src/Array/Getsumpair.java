package Array;

import java.util.HashMap;
import java.util.*;

public class Getsumpair {
    static int[] a;
    static int n;
    public Getsumpair(int ni){
        n=ni;
        a=new int[n];
    }
    public static int getsum(int k){
        int count=0;
         HashMap<Integer, Integer> m = new HashMap<>();
        //  HashMap<Integer, Integer> mh = new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(k-a[i])){
                count+=m.get(k-a[i]);
                System.out.println(a[i]+" "+(k-a[i]));
            }
            if(m.containsKey(a[i])){
                m.put(a[i],m.get(a[i])+1);
            }
            else{
                m.put(a[i],1);
            }
        }
        return count;
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
        System.out.println("Enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Getsumpair gs=new Getsumpair(n);
        arrayinput();
        System.out.println("Enter sum you need");
        int k=sc.nextInt();
        displayarray();
        int ans =getsum(k);
        System.out.println(ans);

    }
}
