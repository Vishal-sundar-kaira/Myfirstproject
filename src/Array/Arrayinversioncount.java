package Array;

import java.util.Scanner;

public class Arrayinversioncount {
    static int n;
    static int a[];
    static int b[];
    

    public Arrayinversioncount(int ni) {
        n = ni;
        a = new int[n];
        b = new int[n];
    }

    public static int mergecount(int low, int mid, int high) {
        int h = low;
        int i = low;
        int j = mid + 1;
        int swap=0;
        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                i++;
                h++;
            } else {
                swap+=((mid+1)-(low+h));
                b[i] = a[j];
                j++;
                i++;
            }
        }

        while (h <= mid) {
            b[i] = a[h];
            i++;
            h++;
        }

        while (j <= high) {
            b[i] = a[j];
            i++;
            j++;
        }

        for (int k = low; k <= high; k++) {
            a[k] = b[k];
        }
        System.out.println(swap);
        return swap;
    }

public static int mergesortcount(int low, int high) {
    int count = 0;
    if (low < high) {
        int mid = (low + high) / 2;
        count += mergesortcount(low, mid);
        count += mergesortcount(mid + 1, high);
        count += mergecount(low, mid, high);
    }
    return count;
}
    public static void inputarray() {
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements of array");
        Arrayinversioncount mergeSort = new Arrayinversioncount(n);
        inputarray();
        //         for (int i = 0; i < n; i++) {
        //     System.out.println(a[i]);
        // }
        int ans=mergesortcount(0, n - 1);
        // System.out.println("Sorted array:");
        // for (int i = 0; i < n; i++) {
        //     System.out.println(a[i]);
        // }
        System.out.println(ans);
    }
}
