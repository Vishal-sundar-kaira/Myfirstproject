package String;

import java.util.HashMap;
import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roman number");
        String s=sc.nextLine();
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans=0;
        //if less than from next one then do minus if greater than add.
        for(int i=0;i<n;i++){
            if(i<n-1&&map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                ans-=map.get(s.charAt(i));
            }
            else{
                ans+=map.get(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
