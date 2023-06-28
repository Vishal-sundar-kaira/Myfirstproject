package String;

import java.util.*;

public class Phonecount {
        public static void countphone(String s,String[]arr){
            String output="";
            int n=s.length();
            for(int i=0;i<n;i++){
                if(s.charAt(i)==0){
                    output=output+"0";
                }
                else{
                    int position=s.charAt(i)-'A';
                    output=output+arr[position];
                }
            }
            System.out.println(output);
        }
    public static void main(String[] args) {
        String str[]
            = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
        Scanner sc=new Scanner(System.in);
        System.out.println("Phone count enter string");
        String s=sc.nextLine();
        countphone(s,str);

    }
}
