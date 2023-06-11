package Array;

import java.util.Scanner;

public class Kadane {
    static int[] a;
    static int n;
    public Kadane(int size){
        n=size;
        a=new int[n];
    }
    public static int kadane(){
        int max_so_far=Integer.MIN_VALUE;//final result
        int max_ending_here=0;//update everytime.
        for(int i=0;i<n;i++){
            max_ending_here+=a[i];
            if(max_ending_here>max_so_far){
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        return max_so_far;
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
        int n=sc.nextInt();
        Kadane kd=new Kadane(n);
        arrayinput();
        int ans=kadane();
        System.out.println(ans);
    }
}
