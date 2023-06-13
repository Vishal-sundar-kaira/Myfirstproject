package Array;

import java.util.ArrayList;
import java.util.*;

public class Duplicate {
    static int[] a;
    static int n;
    public Duplicate(int size){
        n=size;
        a=new int[n];
    }
    public static ArrayList<Integer> findduplicate(){
        ArrayList<Integer> res=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            a[i]+=1;//increasing each element by value 1;
        }
        int count=0;
        int index;
        for(int i=0;i<n;i++){
            index=Math.abs(a[i])>n?Math.abs(a[i])/(n+1):Math.abs(a[i]);
            if(index==n){//for largest element.
                count++;
                continue;
            }
            int value=a[index];
            if(value<0){
                res.add(index-1);
                a[index]=a[index]*(n+1);
            }
            else if(value>n){
                continue;
            }
            else{
                a[index]=-a[index];
            }
        }
        if(count>1){
        res.add(n-1);
        }
        if(res.size()==0){
            res.add(-1);
        }
        else{
            Collections.sort(res);
        }
        return res;
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
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Integer> ans=new ArrayList<>(n);
        System.out.println("Enter elements of an array");
        Duplicate d=new Duplicate(n);
        arrayinput();
        displayarray();
        ans=findduplicate();
        System.out.println(ans);
    }
}
