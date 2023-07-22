package String;

import java.util.*;

public class Distinctwindow {
    public static void window(String s){
        HashSet<Character>h=new HashSet<>();
        int n=s.length();
        int[] arr1=new int[256];
        int length=0;
        for(int i=0;i<n;i++){
            arr1[s.charAt(i)]=0;
        }
        for(int i=0;i<n;i++){
            if(arr1[s.charAt(i)]==0){
                length++;
                arr1[s.charAt(i)]++;
            }
        }
        int start=0;
        int startindex=0;
        int endindex=0;
        int distinct=length;
        int[]arr=new int[256];
        // for(int i=0;i<n;i++){
        //     arr[s.charAt(i)]++;
        // }
        int i=0;
        int finallen=Integer.MAX_VALUE;
        int count=0;
        while(i<n){
            if(arr[s.charAt(i)]==0){
                count++;
            }
            arr[s.charAt(i)]++;
            while(count==distinct){
                finallen=Math.min(finallen, i-start);
                startindex=start;
                endindex=i;
                arr[s.charAt(start)]--;
                if(arr[s.charAt(start)]==0){
                    count--;
                }
                start+=1;
            }
            i++;
        }
        for(int k=startindex;k<=endindex;k++){
            System.out.print(s.charAt(k));
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        window(s);
    }
}
