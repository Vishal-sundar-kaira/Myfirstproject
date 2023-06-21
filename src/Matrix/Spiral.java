package Matrix;

import java.util.*;

public class Spiral {
    public static void spiral(int[][]mat,int r,int c){
        int top=0;
        int right=c-1;
        int bottom=r-1;
        int left=0;
        ArrayList<Integer> a=new ArrayList<>();
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
               a.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a.add(mat[i][right]);
            }
            right--;
            if(left<=right){
                for(int i=right;i>=left;i--){
                a.add(mat[bottom][i]);
            }
            bottom--;
            }
            if(top<=bottom){
                for(int i=bottom;i>=top;i--){
                a.add(mat[i][left]);
            }
            left++;
            }

        }
        System.out.println(a);
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
        spiral(mat,r,c);
    }
}
