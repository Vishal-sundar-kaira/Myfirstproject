package Matrix;

import java.util.Scanner;

public class Rotatematrix {
    public static void ReverseRows(int[][] mat, int r, int c) {
    for (int i = 0; i < r; i++) {
        int left = 0;
        int right = c - 1;
        while (left < right) {
            int temp = mat[i][left];
            mat[i][left] = mat[i][right];
            mat[i][right] = temp;
            left++;
            right--;
        }
    }
}
    public static void Rotate(int[][] mat,int r,int c){
       int n=r;
       int temp;
       for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
       }
       //reverse
       System.out.println("before reverse row");
       displaymat(mat, r, c);
       ReverseRows(mat, r, c);
       System.out.println("after reverse row");
       displaymat(mat, r, c);
       

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
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("\n");
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
        // displaymat(mat, r, c);
        Rotate(mat, r, c);
    }
}
