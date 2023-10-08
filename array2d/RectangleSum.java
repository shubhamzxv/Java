package array2d;

public class RectangleSum {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}};

        System.out.println(findSum(arr,0,0,0,0));
    }

    private static int findSum(int[][] arr, int r1, int c1, int r2, int c2) {
        findPrefixsumMatrix(arr);
        findPrefixsumMatrixcol(arr);
        int sum =0, ans=0, up = 0, left = 0, leftup=0;

        sum= arr[r2][c2];
        if(c1>=1){
            left = arr[r2][c1-1];
        }
        if(r1>=1){
            up = arr[r1-1][c2];
        }
        if(c1>=1 && r1 >= 1){
            leftup = arr[r1-1][c1-1];
        }
        ans = sum+leftup-up-left;
        return ans;
        //return arr[r2][c2]-arr[r1-1][c2]-arr[r2][c1-1]+arr[r1-1][c1-1];
    }
    private static void findPrefixsumMatrixcol(int[][] arr) {
        int r= arr.length;
        int c = arr[0].length;

        // traverse horizontally to calculate row wise prefix sum
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] += arr[i-1][j];
            }
        }
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

    public static void display(int[][] arr){
        int r= arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
