package Array;
import java.util.*;
public class Stock2 {
    static int n;
    static int a[];
    public Stock2(int ni) {
        n = ni;
        a = new int[n];
    }
    public static int maxprofit(){
        int profit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                profit+=(a[i]-a[i-1]);
            }
        }
        return profit;
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
        System.out.println("Enter size of an array or days");
        int n=sc.nextInt();
        Stock2 s=new Stock2(n);
        System.out.println("Enter elements or price per day of an stock/array");
        arrayinput();
        displayarray();
        int ans=maxprofit();
        System.out.println(ans);
    }
}
