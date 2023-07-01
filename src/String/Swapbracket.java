package String;

import java.util.*;

public class Swapbracket {
    public static int balance(String s){
        int sum=0;
        int n=s.length();
        Vector<Integer> v=new Vector<>();
        for(int i=0;i<n;i++){//here stored all index of [.
            if(s.charAt(i)=='['){
                v.add(i);
            }
        }
        int count=0;
        int p=0;
        char[] st=s.toCharArray();
        //now traverse.
        for(int i=0;i<n;i++){
            if(st[i]=='['){
                count++;
                p++;
            }
            else{
                count--;
            }
            if(count<0){
                sum+=v.get(p)-i;
                char temp=st[i];
                st[i]=st[v.get(p)];
                st[v.get(p)]=temp;
                p++;
                count=1;

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine();
        System.out.println(balance(s));
    }
}
