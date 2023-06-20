package Array;

import java.util.*;

public class Median {
    public static int median(int[] arr1,int[] arr2){
        if(arr1.length>arr2.length)return median(arr2, arr1);
        int n1=arr1.length;
        int n2=arr2.length;
        int low=0;
        int high=n1-1;
        while(low<high){
            int cut1 = low + ((high - low) / 2);
            System.out.println(cut1);
            int cut2 = ((n1 + n2 + 1) / 2) - cut1;

            int left1=cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
            int left2=cut2==0?Integer.MIN_VALUE:arr2[cut2-1];
            int right1=cut1==n1?Integer.MAX_VALUE:arr1[cut1];
            int right2=cut2==n2?Integer.MAX_VALUE:arr2[cut2];

            if(left1<right2&&left2<right1){
                if((n1+n2)%2==0){
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2;
                }
                else{
                    return (Math.max(left1,left2));
                }
            }
            else if(left1>right2){
                high=cut1-1;
            }
            else{
                low=cut1+1;
            }
        }
        return 0;
    }
    public static void arrayinput(int[] arr,int size)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public static void displayarray(int[]arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of an array 1");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter size of an array 2");
        int m=sc.nextInt();
        int[] b=new int[m];
        System.out.println("Enter elements of aray 1");
        arrayinput(a,n);
        System.out.println("Enter elements of aray 2");
        arrayinput(b,m);
        displayarray(a,n);
        System.out.println("\n");
        displayarray(b,m);
        System.out.println("\n");
        System.out.println(median(a, b));
    }
}
