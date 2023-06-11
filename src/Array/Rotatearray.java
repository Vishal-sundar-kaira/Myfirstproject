package Array;

import java.util.Scanner;

public class Rotatearray {
        static int[] a;
    static int n;
    public Rotatearray(int size){
        n=size;
        a=new int[n];
    }
    public static void rotate(){
        int x=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=x;

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
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Rotatearray ra=new Rotatearray(n);
        arrayinput();
        displayarray();
        System.out.println("\n");
        System.out.println("Enter numbers of time you need to rotate");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            rotate();
        }
        displayarray();
    }
}
