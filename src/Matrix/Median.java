package Matrix;

import java.util.*;

public class Median {
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
    public static int findelements(int[][]mat,int assumedmedian){
        int count=0;
        for(int i=0;i<mat.length;i++){
            int start=0;
            int end=mat[i].length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mat[i][mid]<=assumedmedian){
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
    public static int getmedian(int[][] mat,int r,int c){
        int n=(r*c)-1;
        int start=1;
        int end=500;
        int medianindex=n/2;
        while(start<=end){
             int assumedmedian=start+(end-start)/2;
             int k=findelements(mat,assumedmedian);//find elements less than assumedmedain in matrix mat.
            if(k<=medianindex){
                start=assumedmedian+1;
            }else{
                end=assumedmedian-1;
            }
        }
        return start;
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
        System.out.println(getmedian(mat,r,c));
    }
}
