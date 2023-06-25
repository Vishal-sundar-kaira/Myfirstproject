package String;

import java.util.*;

public class Palindrome {
    public static boolean palindrome(String s){
        char[] st=s.toCharArray();
        int n=st.length;
        for(int i=0,j=n-1;i<n/2;i++,j--){
            if(st[i]!=st[j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println(palindrome(s));
    }
}
