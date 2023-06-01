package Array;
import java.util.*;
public class Minmax {
    static class Pair{
        int min;
        int max;
    }
    static void arrayinput(int n,int[] array)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
    }
    static void displayarray(int n,int[] array)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    static Pair minmax(int low,int high,int[]arr)
    {
        Pair pair=new Pair();
        Pair minmax1=new Pair();
        Pair minmax2=new Pair();
        int mid;
        if(low==high)
        {
            pair.min=arr[low];
            pair.max=arr[low];
            return pair;
        }
        else if(high==low+1)
        {
            if(arr[low]>arr[high])
            {
                pair.max=arr[low];
                pair.min=arr[high];
                return pair;
            }
            else{
                pair.max=arr[high];
                pair.min=arr[low];
                return pair;
            }
        }
            mid=(low+high)/2;
            minmax1=minmax(low, mid, arr);
            minmax2=minmax(mid+1, high, arr);
            if(minmax1.min<minmax2.min)
            {
                pair.min=minmax1.min;
            }
            else{
                pair.min=minmax2.min;
            }
            if(minmax1.max>minmax2.max)
            {
                pair.max=minmax1.max;
            }
            else{
                pair.max=minmax2.max;
            }
            return pair;
    }
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        arrayinput(n,arr);
        displayarray(n, arr);
        Pair minmax=minmax(0,n-1,arr);
        System.out.println("minimum is\t"+minmax.min+"maximum is\t"+minmax.max);


    }
}
