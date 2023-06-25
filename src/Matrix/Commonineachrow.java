package Matrix;

import java.util.*;


public class Commonineachrow {
    public static void Common(int[][]mat,int r,int c){
        //append first row in hashmap.
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<c;i++){
            h.put(mat[0][i],1);//value 1 means present in 1st row.
        }
        //now travel all other rows and compare.
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                if(h.get(mat[i][j])!=null&&h.get(mat[i][j])==i){//already had freq 1 means was present in first row.
                    h.put(mat[i][j],i+1);
                    if(i==r-1){
                    System.out.print(mat[i][j]+" ");
                }
                }
            }
        }
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
        Common(mat, r, c);
    }
}
// mat[4][5] = {{1, 2, 1, 4, 8},
//              {3, 7, 8, 5, 1},
//              {8, 7, 7, 3, 1},
//              {8, 1, 2, 7, 9},
//             };