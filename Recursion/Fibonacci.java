package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }

    }

    private static int fibo(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
