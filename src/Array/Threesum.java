package Array;

import java.util.*;

public class Threesum {
    static int[] a;
    static int n;
    public Threesum(int ni){
        n=ni;
        a=new int[n];
    }
    public static void sum(){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            if(i==0||(i>0&&a[i]!=a[i-1])){
                int lo=i+1;
                int hi=a.length-1;
                int sum=0-a[i];
                while(lo<hi){
                    if(a[lo]+a[hi]==sum){
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(a[i]);
                        temp.add(a[lo]);
                        temp.add(a[hi]);
                        res.add(temp);
                        while(lo<hi&&a[lo]==a[lo+1])lo++;
                        while(lo<hi&&a[hi]==a[hi-1])hi--;
                        lo++;
                        hi--;
                    }
                    else if(lo+hi<sum)lo++;
                    else hi--;
                }
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i)+" ");
            System.out.println();
        }
        
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
        int n= sc.nextInt();
        Threesum gs=new Threesum(n);
        arrayinput();
        sum();
        displayarray();

    }
}
