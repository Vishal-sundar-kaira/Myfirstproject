package String;

import java.util.Scanner;

public class Boyermoore {
    static int size=256;
    static int[] badchar=new int[size];
    public static void badmatch(String p,int n){
        for(int i=0;i<n;i++){
            badchar[(int)p.charAt(i)]=i;//storing at asci value index their positions.
        }
    }
    public static void Boyer(String str,String pat){
        int m=pat.length();
        int n=str.length();
        badmatch(pat,m);
        int s=0;
        while(s<=(n-m)){
            int j=m-1;
            while(j>=0&&pat.charAt(j)==str.charAt(s+j)){
                j--;
            }
            if(j<0){
                System.out.println("pattern found at index "+s);
                if(s+m<n){
                    s+=m-badchar[(int)str.charAt(s+m)];
                }
                else{
                    s+=1;
                }
                
            }
            else{
                s+= Math.max(1,j-badchar[(int)str.charAt(j+s)]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter text");
        String text=sc.nextLine();
        System.out.println("Enter pattern");
        String pat=sc.nextLine();
        Boyer(text,pat);
    }
}
// ABAAABCD
