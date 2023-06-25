package String;

import java.util.*;

public class Reverse {
    public static void Reverse(String s){
        char[] st=s.toCharArray();
        int n= st.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(st[i]+"");
        }
    }
    public static void recurrsive(char[] s,int i){
        int n=s.length;
        char temp;
        if(i==n/2){
            return;
        }
            //swap
            temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
            recurrsive(s, i+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String string=sc.nextLine();
        Reverse(string);
        //try with reverse approach.
        char[] st=string.toCharArray();
        recurrsive(st,0);
        System.out.println("\n");
        System.out.println("reversed with recurrsion\n");
        System.out.println(st);
    }
}
