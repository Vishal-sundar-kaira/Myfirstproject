package String;

import java.util.*;

public class Count_and_say {
    public static String count(int n){
        int counter=0;
        String current="";
        if(n==1){
            return "1";
        }
        String s=count(n-1);
        int l=s.length();
        for(int j=0;j<l;j++){
            counter++;
            if(j==l-1||s.charAt(j)!=s.charAt(j+1)){
                current=current+counter+s.charAt(j);
                counter=0;
            }
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which number from sequence you need");
        int n=sc.nextInt();
        System.out.println( count(n));
    }
}
