package Array;

import java.util.*;

public class Alternativeposneg {
    static int n;
    static int[] a;
    public Alternativeposneg(int size){
        n=size;
        a=new int[n];
    }
    public static void rearrange(){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                pos.add(a[i]);
            }
            else{
                neg.add(a[i]);
            }
        }
        int posl=pos.size();
        int negl=neg.size();
        if(posl>negl){
            for(int i=0;i<negl;i++){
                arr.add(pos.get(i));
                arr.add(neg.get(i));
            }
            for(int i=negl;i<posl;i++){
                arr.add(pos.get(i));
            }
        }
        else{
        for(int i=0;i<posl;i++){
            arr.add(pos.get(i));
            arr.add(neg.get(i));
        }
        for(int i=posl;i<posl;i++){
            arr.add(neg.get(i));
        }
    }
    for(int i=0;i<n;i++){
        System.out.println(arr.get(i));
    }

    }
    public static void arrayinput(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
    public static void displayarray(){
    for(int i=0;i<n;i++){
        System.out.println(a[i]+" ");
    }
    }
    public static void main(String[] args) {
        System.out.println("Enter size of an array");
        Scanner sc = new Scanner(System.in);
        int ni=sc.nextInt();
        Alternativeposneg pn=new Alternativeposneg(ni);
        arrayinput();
        // displayarray();
        rearrange();

    }
}
