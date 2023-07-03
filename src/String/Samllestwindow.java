package String;

import java.util.*;

import Array.Hashmap;

public class Samllestwindow {
    public static void window(String s,String p){
        int m=p.length();
        int n=s.length();
        int[]pat =new int[256];
        for(int i=0;i<m;i++){
            pat[p.charAt(i)]=0;
        }
        for(int i=0;i<m;i++){
            pat[p.charAt(i)]++;
        }
        int start=0;
        int startindex=0;
        int endindex=0;
        int[]str=new int[256];
        for(int i=0;i<n;i++){
            str[s.charAt(i)]=0;
        }
        int i=0;
        int finallen=Integer.MAX_VALUE;
        int count=0;//tist
        while(i<n){
            str[s.charAt(i)]++;//count=2
            if(pat[s.charAt(i)]>=str[s.charAt(i)]){
                count++;
            }
            while(count==m){
                if(finallen>(i-start)){
                    finallen=(i-start);
                    startindex=start;
                    endindex=i;
                }

                if(str[s.charAt(start)]==pat[s.charAt(start)]){
                    str[s.charAt(start)]--;
                    count--;
                }
                else{
                    str[s.charAt(start)]--;
                }
                start++;
            }
            i++;
        }
        for(int k=startindex;k<=endindex;k++){
            System.out.print(s.charAt(k));
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text");
        String s=sc.nextLine();
        System.out.println("Enter pattern");
        String p=sc.nextLine();
        window(s,p);
    }
}
// thisisateststring