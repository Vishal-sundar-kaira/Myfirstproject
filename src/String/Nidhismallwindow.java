package String;

import java.util.Scanner;

public class Nidhismallwindow {

    public static String window(String s, String p)
    {
        if(p.length()>s.length())
            return "";
        int min_len=Integer.MAX_VALUE;
        int cs[]=new int[256];
        int cp[]=new int[256];
        int final_len=Integer.MAX_VALUE;

        for(int i=0;i<p.length();i++)
            cp[p.charAt(i)]++;

        int start=0,start_index=-1,count=0;

        for(int i=0;i<s.length();i++)
        {
            cs[s.charAt(i)]++;
            if (cs[s.charAt(i)] <= cp[s.charAt(i)])
                count++;

            if (count == p.length()) {
                while (cs[s.charAt(start)] > cp[s.charAt(start)] || cp[s.charAt(start)] == 0)
                {
                    if (cs[s.charAt(start)] > cp[s.charAt(start)])
                        cs[s.charAt(start)]--;
                    start++;
                }
                min_len = i - start+1 ;
                //System.out.println(i+" "+start);
                if (min_len < final_len) {
                    final_len = min_len;
                    start_index = start;
                }
            }
        }

        return s.substring(start_index,start_index+min_len);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        System.out.println("Enter pattern");
        String p = sc.nextLine();
        System.out.println(window(s,p));
    }
}
