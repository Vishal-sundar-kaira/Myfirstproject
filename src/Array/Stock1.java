package Array;

import java.util.Scanner;

public class Stock1 {
    static int n;
    static int a[];
    public Stock1(int ni) {
        n = ni;
        a = new int[n];
    }
    public static int maxprofit(){
        int buy=a[0];
        int max=0;
        for(int i=1;i<n;i++){
            if(buy>a[i]){
                buy=a[i];
            }
            if(a[i]-buy>max){
                max=a[i]-buy;
            }
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
        System.out.println("Enter size of an array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stock1 s=new Stock1(n);
        arrayinput();
        displayarray();
        System.out.println(maxprofit()); 

    }
    
}
