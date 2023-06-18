package Array;

import java.util.*;

public class Subarrayproduct {
        static int n;
    static int a[];
    public Subarrayproduct(int ni) {
        n = ni;
        a = new int[n];
    }
    public static int maxproduct(){
        int max=Integer.MIN_VALUE;
        int prevmax=0;
        int prefix=1;
        int suffix=1;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix*=a[i];
            suffix*=a[n-i-1];

            max=Math.max(prefix, suffix);
            if(prevmax<max){
                if(prefix>suffix){
                start=end;
                end=i;
                }
                else{
                    start=end;
                    end=n-i-1;
                }
            }
            prevmax=max;
        }
        for(int i=start;i<=end;i++){
            System.out.println(a[i]);
        }
        return max;
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
        Subarrayproduct sp=new Subarrayproduct(n);
        System.out.println("Enter elements of an array");
        arrayinput();
        displayarray();
        System.out.println(maxproduct());

    }
}
