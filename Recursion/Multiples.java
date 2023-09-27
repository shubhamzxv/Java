package Recursion;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        multiples(k,n);
    }

    private static void multiples(int k, int n) {
        if (n==1) {
            System.out.println(k + " ");
            return;
        }
        multiples(k,n-1);
        System.out.println(k*n + " ");
    }
}
