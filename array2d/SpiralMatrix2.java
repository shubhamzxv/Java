package array2d;

import java.util.Scanner;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        genSpiraMatrix(n);


    }

    private static void genSpiraMatrix(int n) {
        int[][] arr = new int[n][n];
        int leftcol = 0 ,rightcol=n-1 ,toprow= 0, bottomrow=n-1  ;
        int count= 1;
        while (count<=n*n) {
            for (int i = leftcol; i <= rightcol && count<=n*n; i++) {
                arr[toprow][i] = count;
                count++;
            }
            toprow++;
            for (int i = toprow; i <= bottomrow && count<=n*n; i++) {
                arr[i][rightcol] = count;
                count++;
            }
            rightcol--;

            for (int i = rightcol; i >= leftcol && count<=n*n; i--) {
                arr[bottomrow][i] = count;
                count++;
            }
            bottomrow--;

            for (int i = bottomrow; i >=toprow && count<=n*n; i--) {
                arr[i][leftcol]= count;
                count++;
            }
            leftcol++;
        }

        diplayMatrix(arr);
    }

    private static void diplayMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
