package Recursion;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(seriesSum1(n));

    }

    private static int seriesSum1(int n) {
        if(n==1) return 1;
        return n+seriesSum1(n-1);
    }
}
