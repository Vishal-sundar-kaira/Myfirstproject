package String;
import java.util.*;
public class Split {
    public static int splitbinary(String s){
        int n=s.length();
        int count0=0;
        int count1=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                count0++;
            }
            else if(s.charAt(i)=='1'){
                count1++;
            }
            if(count0==count1){
                cnt++;
            }
        }
        if(count0!=count1){
            return -1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary string");
        String s=sc.nextLine();
        System.out.println(splitbinary(s)); 
    }
}
