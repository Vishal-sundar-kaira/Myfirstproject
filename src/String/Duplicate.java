package String;

import java.util.*;

public class Duplicate {
    public static void getduplicate(String s){
        char[] st=s.toCharArray();
        int n=st.length;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(st[i],h.getOrDefault(st[i],0)+1);
        }
        for(Map.Entry mp:h.entrySet() ){
            char key=(char)mp.getKey();
            int val=(int)mp.getValue();
            if(val>1){
                System.out.println(key);
            }
        }

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        getduplicate(s);
    }
}
