package String;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {
    public static Boolean match(String s1,String s2){
        HashMap<Character,Character> h=new HashMap<>();
        if(s1.length()!=s2.length()){
            return false;
        }
        char c;
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(h.containsKey(s1.charAt(i))){
                c=h.get(s1.charAt(i));
                if(c!=s2.charAt(i)){
                    return false;
                }
            }
            else if(!h.containsValue(s2.charAt(i))){
                h.put(s1.charAt(i), s2.charAt(i));
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1=sc.nextLine();
        System.out.println("Enter String 2");
        String s2=sc.nextLine();
        System.out.println(match(s1,s2));
    }
}
