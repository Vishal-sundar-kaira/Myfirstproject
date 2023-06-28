package String;
import java.util.*;
public class Countstring {
    public static int search(char[][]a,String s,int i,int j,int idx,int n){
        int found=0;
        if(i>=0 && j>=0 && i<n && j<n && s.charAt(idx)==a[i][j]){
            char temp=a[i][j];
            a[i][j]=0;
            idx++;
            if(idx==s.length()){
               found=1;
            }
            else{
                found+=search(a,s,i+1,j,idx,n);
                found+=search(a,s,i-1,j,idx,n);
                found+=search(a,s,i,j+1,idx,n);
                found+=search(a,s,i,j-1,idx,n);
            }
            a[i][j]=temp;
        }
        return found;
    }
    public static void matinput(char[][]mat,int r,int c){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            mat[i][j]=sc.next().charAt(0);
        }
    }
    }
    public static void displaymat(char[][]mat,int r,int c){
            for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of grid");
        int n=sc.nextInt();
        char[][] grid=new char[n][n];
        matinput(grid,n,n);
        System.out.println("Enter string");
        sc.nextLine();
        String s=sc.nextLine();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans+=search(grid,s,i,j,0,n);;
            }
        }
        System.out.println(ans);
    }
}
// Input : a ={
//             {D,D,D,G,D,D},
//             {B,B,D,E,B,S},
//             {B,S,K,E,B,K},
//             {D,D,D,D,D,E},
//             {D,D,D,D,D,E},
//             {D,D,D,D,D,G}
//            }
//         str= "GEEKS"