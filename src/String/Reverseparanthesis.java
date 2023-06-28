package String;

import java.util.*;

public class Reverseparanthesis {
    public static int findreverse(String s){
        int n= s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='}' && !st.isEmpty()){
                if(st.peek()=='{'){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        int newstack=st.size();
        int ni=0;
        while(!st.isEmpty()&&st.peek()=='{'){
            st.pop();
            ni++;
        }
        return (newstack/2)+ni%2;//ni for counting if "{" are extras not even.0
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the paranthesis");
        String s=sc.nextLine();
        System.out.println(findreverse(s)); 
    }
}
