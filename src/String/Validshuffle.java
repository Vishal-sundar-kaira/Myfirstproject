package String;

import java.util.*;

public class Validshuffle {
    public static boolean isshuffle(String s1,String s2,String s3){
        char[] st1=s1.toCharArray();
        char[] st2=s2.toCharArray();
        char[] st3=s3.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        Arrays.sort(st3);
        int s1len=st1.length;
        int s2len=st2.length;
        int s3len=st3.length;
        if((s1len+s2len)!=s3len){
            return false;
        }
        int i,j,k;
        i=j=k=0;
        for(k=0;k<s3len;k++){
            if(i<s1len&&st3[k]==st1[i]){
                i++;
            }
            else if(j<s2len&&st3[k]==st2[j]){
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        System.out.println("Enter string 3");
        String s3=sc.nextLine();
        System.out.println(isshuffle(s1,s2,s3)); 
    }
}
