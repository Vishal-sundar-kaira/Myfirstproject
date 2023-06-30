package String;

import java.util.*;

public class Binaryflip {
    public static char flip(char expected){
        return (expected=='0')?'1':'0';
    }
    public static int findingflip(String s,char expected){
        int flippoint=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=expected){
                flippoint++;
            }
            expected=flip(expected);
        }
        return flippoint;
    }
    public static int findflip(String s){
        return Math.min(findingflip(s,'0'),findingflip(s,'1'));//flip with starting 0 or 1.
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter binary string");
    String s=sc.nextLine();
    System.out.println("Number of flip required is "+findflip(s));
    }

}
// 0001010111