package Array;

import java.util.Scanner;

public class Mergetwoarray {
    static int[] a;
    static int[]b;
    static int[]c;
    static int n;
    static int m;
    public Mergetwoarray(int size,int size2){
        n=size;
        m=size2;
        a=new int[n];
        b=new int[m];
        c=new int[n+m];
    }
    public static void merge(){
        int acount=0;
        int bcount=0;
        int i;
        for(i=0;i<(m+n);i++){
            if(acount==n||bcount==m){
                break;
            }
            if(a[acount]<b[bcount]){
                c[i]=a[acount];
                acount++;
            }
            else{
                c[i]=b[bcount];
                bcount++;
            }
        }
        if(acount==n){
            for(int k=i;k<(m+n);k++){
                c[k]=b[bcount];
                bcount++;
            }
        }
        else{
            for(int k=i;k<(m+n);k++){
                c[k]=a[acount];
                acount++;
            }
        }
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
        System.out.println("Enter size of an array 2");
        int m=sc.nextInt();
        Mergetwoarray mg=new Mergetwoarray(n, m);
        System.out.println("Enter elements of aray 1");
        arrayinput(a,n);
        System.out.println("Enter elements of aray 2");
        arrayinput(b,m);
        displayarray(a,n);
        displayarray(b,m);
        merge();
        displayarray(c, m+n);
    }
}
