package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findSum(n));
    }

    private static int findSum(int n) {
        if (n==0) return 0;

        return (n%10)+findSum(n/10) ;
    }
}
