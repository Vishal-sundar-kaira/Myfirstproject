package String;
import java.util.*;
public class Kmp {
    public static void computelps(String p,int m,int[]lps){
        int len=0;//highest lps till now.
        lps[0]=0;
        int i=1;
        while(i<m){
            if(p.charAt(i)==p.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }
    public static void kmpalgo(String s,String p){
        int m=p.length();
        int n=s.length();
        int[]lps=new int[m];
        computelps(p,m,lps);
        int i=0;
        int j=0;
        while((n-i)>=(m-j)){
            if(s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                System.out.println("found pattern at index "+(i-j));
                j=lps[j-1];
            }
            else if(i<n&&p.charAt(j)!=s.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string and pattern");
        String s=sc.nextLine();
        String p=sc.nextLine();
        kmpalgo(s,p);

    }
}
