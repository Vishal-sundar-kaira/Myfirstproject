package String;

import java.util.*;

public class Removeduplicates {//adjacent duplicates.
    static char last_removed;
    public static String remove(String s){
        if(s.length()==0||s.length()==1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            last_removed=s.charAt(0);
            while (s.length() > 1
                   && s.charAt(0) == s.charAt(1))
                s = s.substring(1, s.length());
            s=s.substring(1);
            return remove(s);
        }
        
        String rem_str=remove(s.substring(1,s.length()));
        if(rem_str.length()==0&&last_removed==s.charAt(0)){
            return rem_str;
        }
        if(rem_str.length()!=0&&s.charAt(0)==rem_str.charAt(0)){
            last_removed=s.charAt(0);
            return rem_str.substring(1, rem_str.length());
        }

        return (s.charAt(0)+rem_str);
    }
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(remove(s));
    }
}
