package Array;

import java.util.*;

//so we need to get closer to average height to decrease height difference.
public class Minimizeheight{
    static int n;
    static int[] a;
    public Minimizeheight(int size){
        n=size;
        a=new int[n];
    }
    public static int minheight(int k){
        int ans;
        Arrays.sort(a);
        int minh=a[0];
        int maxh=a[n-1];
        ans=maxh-minh;
        for(int i=1;i<n;i++){
            if(a[i]-k<0){
                continue;
            }
            minh=Math.min(a[0]+k,a[i]-k);
            maxh=Math.max(a[n-1]-k, a[i-1]+k);
            ans=Math.min(ans,maxh-minh);
        }
        return ans;
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Minimizeheight mh=new Minimizeheight(n);
        System.out.println("Enter value of elements in array");
        arrayinput();
        displayarray();
         System.out.println("Enter value of k for increment and decrement");
        int k = sc.nextInt();
        int ans=minheight(k);
        System.out.println("min is "+ans);

    }
}
