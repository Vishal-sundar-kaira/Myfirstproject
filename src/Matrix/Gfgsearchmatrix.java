package Matrix;

import java.util.Scanner;

public class Gfgsearchmatrix {
    public static boolean search(int[][] mat,int r,int c,int x){
        int i=0;
        int j=c-1;
        while(i<r&&j>0){
            if(mat[i][j]==x){
                return true;
            }
            else if(x<mat[i][j]){
                j--;
            }
            else{
                i++;
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