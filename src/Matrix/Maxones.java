package Matrix;

import java.util.Scanner;

public class Maxones {
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
    public static int getones(int[][]mat,int r,int c){
        int col=c-1;
        int row=-1;
        for(int i=0;i<r;i++){
            for(int j=col;j>=0;j--){
                if(mat[i][j]==1){
                    col--;//now you dont need to travel this column in any row as its sorted.
                    row=i;
                }
                else{
                    break;
                }
            }
        }
        return row;
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
        System.out.println(getones(mat,r,c));
    }
}
