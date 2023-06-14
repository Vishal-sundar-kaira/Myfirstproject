package Array;

import java.util.*;

public class Nextpermutation {
    public static void swap(int i,int j,char[]arr){
        char temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static char[] findnext(String s){
        char[] arr=s.toCharArray();//converting to array
        int n=arr.length;
        int i=n-2;
        while(i>=0&&arr[i]>arr[i+1]){//comparing and finding if they are in descending order
            i--;
        }
        if(i<0){
            String ans="No new permutation";
            char[] error=ans.toCharArray();
            return error;
        }
        int j=n-1;
        while(j>=0&&arr[j]<=arr[i]){
            j--;
        }
        swap(i,j,arr);
        //reverse it 
        int start=i+1;
        int end=n-1;
        while(start<=end){
            swap(start,end,arr);
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println(findnext(s));
    }
}
