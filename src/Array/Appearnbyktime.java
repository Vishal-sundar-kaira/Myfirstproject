package Array;

import java.util.*;

public class Appearnbyktime {
            static int n;
    static int a[];
    public Appearnbyktime(int ni) {
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
    public static void findvalues(int k){
        int val=n/k;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(a[i])){
                h.put(a[i], h.get(a[i])+1);
                if(h.get(a[i])==val+1){
                    System.out.println(a[i]+" ");
                }
                continue;
            }
            h.put(a[i],1);

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Appearnbyktime sp=new Appearnbyktime(n);
        System.out.println("Enter elements of an array");
        arrayinput();
        System.out.println("Enter k for n/k");
        int k=sc.nextInt();
        displayarray();
        findvalues(k);

    }
}
