package String;
import java.util.*;
public class Rabinkarp {
        public static void rabin(String text,String pat){

            int m=pat.length();
            int n=text.length();
            int i,j;
            int h=1;
            int d=256;
            int q=13;
            int p=0,t=0;
            for(i=0;i<m-1;i++){
                h=(h*d)%q;
            }
            for(i=0;i<m;i++){
                p=(d*p+pat.charAt(i))%q;
                t=(d*t+text.charAt(i))%q;
            }
            for(i=0;i<=n-m;i++){
                // System.out.println(p+t);
                if(p==t){
                    System.out.println("p==t"+" "+i);
                    for(j=0;j<m;j++){
                        if(pat.charAt(j)!=text.charAt(i+j)){
                            break;
                        }
                    }
                    if(j==m){
                        System.out.println("Pattern found at index "+i);
                    }
                }
                if(i<n-m){
                    t=((d*(t-text.charAt(i)*h))+text.charAt(i+m))%q;
                    if(t<0){
                        t=q+t;
                    }
                }
            }
            System.out.println("no test");
        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter text");
        String text=sc.nextLine();
        System.out.println("Enter pattern");
        String pat=sc.nextLine();
        rabin(text,pat);
    }
}
