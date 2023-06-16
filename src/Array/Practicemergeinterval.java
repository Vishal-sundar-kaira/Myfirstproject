package Array;

import java.util.*;
import java.util.Arrays;
public class Practicemergeinterval {
    public static class Interval{
        int start;
        int end;
        Interval(int s,int e){
            this.start=s;
            this.end=e;
        }
    }
        public static void merge(Interval[] arr,int n){
            Arrays.sort(arr,new Comparator<Interval>(){
                public int compare(Interval i1,Interval i2){
                    return i1.start-i2.start;
                }
            });
            int index=0;
            for(int i=1;i<n;i++){
                if(arr[index].end>arr[i].start){
                    //merge
                    arr[index].end=Math.max(arr[index].end,arr[i].end);
                }
                else{
                    index++;
                    arr[index]=arr[i];
                }
            }
            for(int i=0;i<=index;i++){
                System.out.println(arr[i].start+" "+arr[i].end);
            }

        }
        
    public static void main(String[] args) {
        System.out.println("Enter size of an array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Interval[] arr=new Practicemergeinterval.Interval[n];
        for(int i=0;i<n;i++){
            int start=sc.nextInt();
            int end=sc.nextInt();
            arr[i]=new Interval(start,end);
        }
        merge(arr,n);
}
}
