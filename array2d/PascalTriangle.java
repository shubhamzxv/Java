package array2d;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for pascal tringle.");
        int n = sc.nextInt();
        printPascalTringle(n);

    }

    private static void printPascalTringle(int n) {
        int[][] pascal = new int[n][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i+1];
            pascal[i][0] = pascal[i][i] = 1;
            for (int j = 1; j < i ; j++) {
                pascal[i][j] = pascal[i-1][j]+pascal[i-1][j-1];
            }
        }
        displayArray(pascal);
    }
    static void displayArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
}
