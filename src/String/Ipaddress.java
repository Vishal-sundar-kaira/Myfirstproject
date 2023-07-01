package String;

import java.util.*;

public class Ipaddress {
    public static void genip(String s,int i,int j,int level,String temp,ArrayList<String> res){
        if(i==(j+1)&&level==5){
            System.out.println("good "+temp);
            res.add(temp.substring(1));
        }
        for(int k=i;k<i+3&&k<=j;k++){
            String ad=s.substring(i, k+1);
            if(s.charAt(k)=='0'&&ad.length()>1||Integer.valueOf(ad)>255){
                return;
            }
            //  System.out.println("good "+temp);
            // System.out.println(level);
            genip(s, k+1, j, level+1, temp+"."+ad, res);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to get its possible IP addresses");
        String s=sc.nextLine();
        int n=s.length();
        ArrayList<String> ans=new ArrayList<>(); 
        genip(s, 0, n-1, 1, "", ans);
        for(String s1:ans){
            System.out.println(s1);
        }
    }
    
}
