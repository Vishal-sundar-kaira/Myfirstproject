package String;

import java.util.*;

public class Adjacent {
        public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null; // Value not found in the hashmap
    }
    public static String solveadjacent(String s){
        int n=s.length();
        int[]arr=new int[26];
        int maxi=Integer.MIN_VALUE;
        char maxval='\0';
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-(int)'a']++;
            if(maxi<arr[s.charAt(i)-(int)'a']){
                maxi=arr[s.charAt(i)-(int)'a'];
                maxval=s.charAt(i);
            }
        }
        if(maxi>(n+1)/2){
            return "not possible";
        }
        String res="";
        for(int i=0;i<n;i++){
            res+=' ';
        }//all made empty space
        int ind=0;
        while(maxi>0){
                res=res.substring(0, ind)+maxval+res.substring(ind+1);
                maxi--;
                ind+=2;
        }
        arr[(int)maxval-(int)'a']=0;
        for(int j=0;j<26;j++){
            while(arr[j]>0){
                ind=ind<n?ind:1;
                res=res.substring(0, ind)+(char)((int)j+'a')+res.substring(ind+1);
                arr[j]--;
                ind+=2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        System.out.println(solveadjacent(s));
    }
}
