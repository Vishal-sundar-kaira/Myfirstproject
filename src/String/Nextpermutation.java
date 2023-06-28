package String;
import java.util.*;
public class Nextpermutation {
    public static void reverse(char[] s,int i,int n){
        char temp;
        while(i<=n){
            temp=s[i];
            s[i]=s[n];
            s[n]=temp;
            i++;
            n--;
        }
    }
    public static String nextpermutation(String s){
        char[] st=s.toCharArray();
        int n=st.length;
        int i;
        char temp;
        for(i=n-2;i>=0;i--){
            if(st[i]<st[i+1]){
                break;
            }
            if(i==0){
                return "Not possible";
            }
        }
        for(int j=n-1;j>=0;j--){
            if(st[j]>st[i]){
                temp=st[j];
                st[j]=st[i];
                st[i]=temp;
                break;
            }
        }
        System.out.println(st[i]);
        reverse(st,i+1,n-1);
        String newstring=String.valueOf(st);
        return newstring;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number whose next permuation you need");
        String s=sc.nextLine();
        System.out.println(nextpermutation(s));
    }

}
