package Matrix;

import java.util.Scanner;

public class Specificpair {
    public static int getmax(int[][] mat,int r,int c){
        int n=r;
        int[][] maxmat=new int[n][n];
        maxmat[n-1][n-1]=mat[n-1][n-1];//last element
        int ans=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            maxmat[n-1][i]=Math.max(mat[n-1][i],maxmat[n-1][i+1]);//last row
            maxmat[i][n-1]=Math.max(mat[i][n-1],maxmat[i+1][n-1]);//last column
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                maxmat[i][j]=Math.max(maxmat[i+1][j+1],maxmat[i+1][j]);
            }
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                ans=Math.max(ans,maxmat[i+1][j+1]-mat[i][j]);
            }
        }
        return ans;
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
        System.out.println(getmax(mat,r,c));
    }
}
// mat[N][N] = {{ 1, 2, -1, -4, -20 },
//              { -8, -3, 4, 2, 1 }, 
//              { 3, 8, 6, 1, 3 },
//              { -4, -1, 1, 7, -6 },
//              { 0, -4, 10, -5, 1 }};