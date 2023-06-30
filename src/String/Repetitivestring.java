package String;

import java.util.HashSet;
import java.util.Scanner;

public class Repetitivestring {
    public static String findrepetition(String[] s){
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<s.length;i++){
            if(h.contains(s[i])){
                return s[i];
            }
            h.add(s[i]);
        }
        return ("No match");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        String[] str=s.split(" ");
        System.out.println(findrepetition(str)); 
    }
}
