package String;

import java.util.*;

public class Anagrams {
    public static List<List<String>> solveanagrams(String[]s){
        List<List<String>> ls=new ArrayList<>() ;
        HashMap<String,List<String>> h=new HashMap<>();
        for(String i:s){
            char[]arr=i.toCharArray();
            Arrays.sort(arr);
            String str=String.valueOf(arr);
            if(h.containsKey(str)){
                h.get(str).add(i);
            }
            else{
                List<String> nl=new ArrayList<>();
                nl.add(i);
                h.put(str,nl);
            }
        }
        for(List<String> list: h.values()){
            ls.add(list);
        }
        
        return ls;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of strings");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter list of String");
        String[]arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println(solveanagrams(arr)); 

    }
}
// String arr[] = {"geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs", "cat", "act", "tca"};