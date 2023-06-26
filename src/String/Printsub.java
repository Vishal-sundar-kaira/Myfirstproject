package String;

import java.util.*;

public class Printsub {
    public static void subsequence(int index,char[]arr,ArrayList<Character> a){
        int l=arr.length;
        if(index==l){
            System.out.print(a);
            return;
        }
        a.add(arr[index]);
        subsequence(index+1, arr, a);
        a.remove(a.size()-1);
        subsequence(index+1, arr, a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        System.out.println("All subsequences");
        ArrayList<Character> a=new ArrayList<>();
        subsequence(0,arr,a);
    }
}
