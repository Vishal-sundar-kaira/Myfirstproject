package Array;

import java.util.Scanner;

public class Raintrap {
    static int n;
    static int a[];
    public Raintrap(int ni) {
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
    public static int watertrap(){
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=a[0];
        right[n-1]=a[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(a[i], left[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(a[i], right[i+1]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(left[i],right[i])-a[i];
            // System.out.println(sum[i]);
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Raintrap sp=new Raintrap(n);
        System.out.println("Enter elements of an array");
        arrayinput();
        displayarray();
        System.out.println(watertrap());
        // watertrap();
    }
}
