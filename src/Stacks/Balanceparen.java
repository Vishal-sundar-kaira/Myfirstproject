package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Balanceparen {
    public static Boolean isvalid(String s){
        char[] schar=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(char i:schar){
            if(i=='('||i=='['||i=='{'){
                st.push(i);
            }
            else{
                if(st.isEmpty())return false;
                char tp=st.pop();
                if((i==')'&&tp=='(')||(i=='}'&&tp=='{')||(i==']'&&tp=='[')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Enter input string of parenthesis");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Boolean ans=isvalid(s);
        System.out.println(ans);
    }
}
