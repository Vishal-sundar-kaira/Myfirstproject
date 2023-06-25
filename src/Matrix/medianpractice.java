package Matrix;

import java.util.Scanner;

public class medianpractice {
    public static int findsamllest(int[][]mat,int r,int c,int m){
        int count=0;
        for(int i=0;i<r;i++){
            int start=0;
            int end=c-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mat[i][mid]<=m){
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
    public static int median(int[][]mat,int r,int c){
        int n=(r*c)-1;
        int start=1;
        int end=500;
        int med=n/2;
        while(start<=end){
            int mid=start+(end-start)/2;
            int k=findsamllest(mat,r,c,mid);
            if(k<=med){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
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
        System.out.println(median(mat, r, c));
    }
}
