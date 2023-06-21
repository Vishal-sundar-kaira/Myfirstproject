package Matrix;

import java.util.Scanner;

public class Leetcodesearchmatrix {
    public static boolean search(int[][] mat,int r,int c,int x){
        int low=0;
        int high=(r+c)-1;
        
        while(low<=high){
             int mid=low+(high-low)/2;
             int i=mid/c;
             int j=mid%c;
             if(mat[i][j]==x){
                return true;
             }
             else if(x<mat[i][j]){
                high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return false;
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
        System.out.println("Enter element you need to find");
        int x=sc.nextInt();
        System.out.println(search(mat,r,c,x));
    }
}
// Input: mat[4][4] = { {10, 20, 30, 40},  x = 29
//                                {15, 25, 35, 45},
//                                {27, 29, 37, 48},
//                              {32, 33, 39, 50}}