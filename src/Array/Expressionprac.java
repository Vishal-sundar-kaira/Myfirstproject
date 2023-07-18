package Array;
import java.util.*;
public class Expressionprac {
    //practicing expression
    public static int parenthes(String s){
        Stack<Character> st=new Stack<Character>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                st.add(s.charAt(i));
            }
            else {
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    st.add('{');
                    ans++;
                }
            }
        }
        if(st.size()%2!=0){
            return -1;
        }
        else{
            ans+=st.size()/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter parenthesis");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=parenthes(s);
        System.out.println(a);
    }
    

}
