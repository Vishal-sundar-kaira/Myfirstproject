package Array;
import java.util.*;
public class Commoninthreesortedarray {
    public static void findcommon(int[] a,int n1,int[] b,int n2,int[] c,int n3){
        int prev1,prev2,prev3;
        prev1=prev2=prev3=Integer.MIN_VALUE;
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){//till any one array got end.
            while(i<n1&&a[i]==prev1){//for excluding repeated values and moving ahead.
                i++;
            }
            while(j<n2&&b[j]==prev2){
                j++;
            }
            while(k<n3&&c[k]==prev3){
                k++;
            }
            if(i<n1 && j<n2 && k<n3){//after increment of repeated check if any array ended.
                if(a[i]==b[j] && b[j]==c[k]){
                    System.out.println(a[i]+"answer");
                    prev1=a[i];
                    prev2=b[j];
                    prev3=c[k];
                    i++;
                    j++;
                    k++;
                }
                else if(a[i]<b[j]){
                    prev1=a[i];
                    i++;                 
                }
                else if(b[j]<c[k]){
                    prev2=b[j];
                    j++;
                }
                else{
                    prev3=c[k];
                    k++;
                }
            }
        }
    }
    public static void arrayinput(int[] arr,int size){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void displayarray(int[] arr,int size){
    for(int i=0;i<size;i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println("\n");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array 1");
        int n1=sc.nextInt();
        int[] a=new int[n1];
        arrayinput(a, n1);
        System.out.println("Enter size of an array 2");
        int n2=sc.nextInt();
        int[] b=new int[n2];
        arrayinput(b, n2);
        System.out.println("Enter size of an array 3");
        int n3=sc.nextInt();
        int[] c=new int[n3];
        arrayinput(c, n3);
        
        findcommon(a,n1,b,n2,c,n3);
    }
}
//  int ar1[] = { 1, 5, 10, 20, 40, 80, 80 };
//  int ar2[] = { 6, 7, 20, 80, 80, 100 };
//  int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 80, 120 };