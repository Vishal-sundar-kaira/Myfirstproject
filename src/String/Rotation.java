package String;

import java.util.*;

public class Rotation {
    public static boolean ifrotation(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();

        if(n1!=n2){
            return false;
        }
        for(int i=0;i<n1;i++){
            if(s1.charAt(i)==s2.charAt(0)){
                if(s1.substring(i).equals(s2.substring(0,n1-i))){
                    if(s1.substring(0,i).equals(s2.substring(n2-i))){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string 1 and 2");
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    System.out.println(ifrotation(s1,s2));
    }

}
