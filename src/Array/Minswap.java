package Array;

import java.util.Scanner;

public class Minswap {
    static int n;
    static int a[];
    public Minswap(int ni) {
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
    public static int swaps(int sum){
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]<=sum){
                count++;
            }
        }
        int bad=0;
        for(int i=0;i<count;i++){
            if(a[i]>sum){
                bad++;
            }
        }
        int ans=bad;
        for(int i=0,j=count;j<n;i++,j++){
            if(a[i]>sum){
                bad--;
            }
            if(a[j]>sum){
                bad++;
            }
            ans=Math.min(ans, bad);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Minswap s=new Minswap(n);
        System.out.println("Enter elements of array");
        arrayinput();
        displayarray();
        System.out.println("Enter sum");
        int sum=sc.nextInt();
        System.out.println(swaps(sum));
    }
}
