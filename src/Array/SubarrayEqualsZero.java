package Array;

import java.util.*;

public class SubarrayEqualsZero {
    public static boolean findzero(int[]arr,int n){
        int sum=0;
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]==0||sum==0||h.containsKey(sum)){
                int start=h.get(sum);
                for(int j=start+1;j<=i;j++){
                    System.out.println(arr[j]);
                }
                // System.out.println();
                return true;
            }
            else{
                h.put(sum, i);
            }
        }
        return false;
    }
    public static void arrayinput(int[] arr,int size){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    }
    public static void displayarray(int[] arr,int size){
    for(int i=0;i<size;i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println("\n");
    }
    public static void main(String[] args) {
        System.out.println("Enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a= new int[n];
        arrayinput(a,n);
        if(findzero(a,n)){
            System.out.println("true its exist");
        }
        else{
            System.out.println("dont exist");
        };
    }
}
