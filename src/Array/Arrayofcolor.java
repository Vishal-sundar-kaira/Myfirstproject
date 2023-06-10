package Array;

import java.util.*;

public class Arrayofcolor {
    static int n;
    static int [] a;
    public  Arrayofcolor(int size){
        n=size;
        a=new int[n];
    }
    public static void colorsort(){
        int low=0;
        int mid=0;
        int high=n-1;
        int temp=0;
        while(mid<=high){
            switch(a[mid]){
                case 0:{
                    temp=a[mid];
                    a[mid]=a[low];
                    a[low]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=a[mid];
                    a[mid]=a[high];
                    a[high]=temp;
                    high--;
                }
            }
        }
    }
    public static void arrayinput(int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    static void displayarray(int n)
    {
        // Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        // int[] arr=new int[n];
        System.out.println("Enter array");
        Arrayofcolor arrofcolor=new Arrayofcolor(n);
        arrayinput(n);
        displayarray(n);
        colorsort();
        displayarray(n);

    }
}
