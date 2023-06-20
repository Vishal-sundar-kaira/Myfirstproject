package Array;

import java.util.Scanner;

import javax.sound.midi.MidiDevice;

public class Threepartition {
    static int n;
    static int a[];
    public Threepartition(int ni) {
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
    public static void partition(int l,int h){
        int mid=0;
        int low=0;
        int high=n-1;
        int temp;
        while(mid<=high){
            if(a[mid]<l){
                temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                mid++;
                low++;
            }
            else if(a[mid]>h){
                temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
            else{
                mid++;
            }
        }
        displayarray();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        Threepartition s=new Threepartition(n);
        System.out.println("Enter elements of array");
        arrayinput();
        System.out.println("before partition");
        displayarray();
        System.out.println("Enter lowvalue and highvalue");
        int l=sc.nextInt();
        int h=sc.nextInt();
        System.out.println("After partition");
        partition(l,h);
    }
}
// int arr[] = { 1,  14, 5,  20, 4, 2, 54,
//                       20, 87, 98, 3,  1, 32 };