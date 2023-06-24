package Matrix;

import java.util.Scanner;

public class Kthsmallest {
    public static int findsmallest(int[][]a,int k,int n){
        int count=0;
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(a[i][mid]<=k){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            count+=start;
        }
        return count;
    }
    public static int smallest(int[][] mat,int r,int c,int k){
        int low=mat[0][0];
        int n=r*c;
        int high=mat[r-1][c-1];
        while(low<high){
            int assumemid=low+(high-low)/2;
            int smallnumbers=findsmallest(mat,assumemid,r);
            if(smallnumbers>=k){
                high=assumemid-1;
                
            }
            else{
                low=assumemid+1;
            }

        }
        return low;
    }
     public static void matinput(int[][]mat,int r,int c){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            mat[i][j]=sc.nextInt();
        }
    }
    }
    public static void displaymat(int[][]mat,int r,int c){
            for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(mat[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter matrix");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of a row and column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter elements of an array");
        int[][] mat=new int[r][c];
        matinput(mat,r,c);
        displaymat(mat, r, c);
        System.out.println("Enter k ");
        int k=sc.nextInt();
        System.out.println(smallest(mat,r,c,k));
    }
}
// Input:k = 3 and array =
//         10, 20, 30, 40
//         15, 25, 35, 45
//         24, 29, 37, 48
//         32, 33, 39, 50 
// Output: 20
//   int[][] matrix = { { 1, 5, 9 },
//                       { 10, 11, 13 },
//                       { 12, 13, 15 } };