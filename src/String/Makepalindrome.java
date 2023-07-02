package String;

import java.util.Scanner;

public class Makepalindrome {
    public static int makepal(String s){
        int n=s.length();
        int start=0;
        int end=n-1;
        int res=0;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                res++;
                start=0;
                end=n-res-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println(makepal(s));
    }
}
