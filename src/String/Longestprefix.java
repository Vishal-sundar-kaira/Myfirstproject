package String;

import java.util.*;

public class Longestprefix {
    public static String compare(String s1,String s2){
        String result="";
        int i;
        int j;
        for(i=0,j=0;i<s1.length()&&j<s2.length();i++,j++){
            if(s1.charAt(i)==s2.charAt(j)){
                result+=s1.charAt(i);
            }
            else{
                break;
            }
        }
        return result;

    }
    public static String longestcommonprefix(String[]s,int n){
        String prefix=s[0];
        for(int i=1;i<n;i++){
            prefix=compare(prefix,s[i]);
        }
        return prefix;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of a string array");
        int n=sc.nextInt();
        String[] s=new String[n];
        sc.nextLine();
        System.out.println("Enter strings");
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        System.out.println(longestcommonprefix(s,n)); 
    }
}
