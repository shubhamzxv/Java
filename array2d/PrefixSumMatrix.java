package array2d;

public class PrefixSumMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1}};

        System.out.println(findSumBruteforce(arr,1,1,3,3));

        System.out.println(findSumPrefixsum(arr,1,1,3,3));
        //System.out.println(findSumPrefixsum2(arr,1,1,3,3));
    }

    private static void findPrefixsumMatrix(int[][] arr) {
        int r= arr.length;
        int c = arr[0].length;

        // traverse horizontally to calculate row wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }
    }

    private static int findSumPrefixsum(int[][] arr, int r1, int c1, int r2, int c2) {
        findPrefixsumMatrix(arr);
        int sum=0;
        for (int j = r1; j <=r2; j++) {
            if (c1 >= 1) {
                sum += arr[j][c2]-arr[j][c1-1];
            }
            else
                sum += arr[j][c2];
        }
        return sum;
    }

    private static int findSumBruteforce(int[][] arr, int i, int i1, int i2, int i3) {
        int sum =0;

        for (int j = i; j <=i2 ; j++) {
            for (int k = i1; k <= i3; k++) {
                sum += arr[j][k];
            }
        }
        return sum;
    }
}
