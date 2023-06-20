package Array;

import java.util.Scanner;

public class Smallestsubarray {
    static int n;
    static int a[];
    public Smallestsubarray(int ni) {
        n = ni;
        a = new int[n];
    }
    public static int smallest(int x){
        int start=0;
        int end=0;
        int current_sum=0;
        int minlength=n;
        int startindex=0;
        int endindex=0;
        while(end<n){
            while(current_sum<=x&&end<n){
                current_sum+=a[end];
                end++;
            }
            while(current_sum>x&&start<n){
                if((end-start)<minlength){
                    minlength=(end-start);
                    startindex=start;
                    endindex=end;
                }
                current_sum-=a[start];
                start++;
            }
        }
        for(int i=startindex;i<endindex;i++){
            System.out.println(a[i]+" ");
        }

        return minlength;
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
        Smallestsubarray s=new Smallestsubarray(n);
        System.out.println("Enter elements of array");
        arrayinput();
        System.out.println("Enter sum");
        int x=sc.nextInt();
        displayarray();
        System.out.println(smallest(x));
    }
}
