package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class Stockspan {
        ArrayList<Integer> stock;
    public Stockspan() { 
        stock=new ArrayList<>();
    }
    
    public int next(int price) {
        int span=1;
        int len=stock.size();
        // System.out.println(stock+" "+len);
        if(len==0){
            stock.add(price);
            return span;
        }
        int i=len-1;
        while(i>=0&&stock.get(i)<=price){
            span++;
            i--;
        }
        stock.add(price);
        return span;
    }
    //can also solved usi9ng stack (next greater element) can make changes and do;
        static void calSpan(int price[], int n, int S[]){      
        Stack<Integer> st = new Stack<>();   
        st.push(0);    
        S[0] = 1;     
        for(int i = 1; i < n; i++){     
            while((!st.empty()) && (price[st.peek()] <= price[i])){   
                st.pop();   
            }   
            S[i] = (st.empty()) ? (i + 1) : (i - st.peek());     
            st.push(i);   
        }    
    }  
}

 