package Array;

import java.util.*;

public class Unionintersection {
    static int[] a;
    static int[] b;
    static int n,m;
    public Unionintersection(int nsize,int msize){
        n=nsize;
        m=msize;
        a=new int[n];
        b=new int[m];
    }
    public static void union(){
        HashSet<Integer> hs=new HashSet<>(n);
        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<m;i++){
            hs.add(b[i]);
        }
        System.out.println("Union is:");
        System.out.println(hs);

    }
    public static void intersection(){
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer>hs1=new HashSet<>();

        for(int i=0;i<n;i++){
            hs.add(a[i]);
        }
        System.out.println("Intersection are:");
        for(int i=0;i<m;i++){
            if(hs.contains(b[i])){
                hs1.add(b[i]);
            }
        }
        System.out.println(hs1);
    }
    public static void arrayinput(int[]arr,int size)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public static void displayarray(int[]arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array a");
        int n=sc.nextInt();
        System.out.println("Enter size of an array b");
        int m=sc.nextInt();
        Unionintersection ui=new Unionintersection(n, m);
        arrayinput(a,n);
        arrayinput(b,m);
        displayarray(a,n);
        displayarray(b,m);
        union();
        intersection();
        

    }
}
