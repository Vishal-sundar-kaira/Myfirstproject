package Array;

import java.math.BigInteger;
import java.util.*;

public class Largefactorial {
    public static BigInteger factorial(int n){
        BigInteger b=new BigInteger("1");
        for(int i=2;i<n;i++){
            b=b.multiply(BigInteger.valueOf(i));
        }
        return b;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for finding factorial");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
