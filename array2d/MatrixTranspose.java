package array2d;

public class MatrixTranspose {
    static void displayArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] array){
        int[][] ans= new int[array[0].length][array.length];
        for (int i = 0; i <ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j]=array[j][i];
            }
        }
        return ans;
    }

    static void transposeInplace(int[][] array){
        int temp;
        for (int i = 0; i <array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
              // swap   array[i][j],array[j][i];
                temp = array[i][j];
                array[i][j]= array[j][i];
                array[j][i]= temp;
            }
        }

    }
    private static int[][] rotateClockwise(int[][] arr) {
        transposeInplace(arr);

        for (int i = 0; i < arr.length; i++) {
            revArr(arr[i]);
        }
        return arr;
    }
    public static void revArr(int[] arr){
        int a =0;
        int b = arr.length-1;
        int temp;
        while(a<b){
            temp= arr[a];
            arr[a]= arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{2,6,8},{9,7,3},{5,2,1}};
        displayArray(arr);

        //System.out.println("Transpose of matrix");
        //displayArray(transposeInplace(arr));
        System.out.println("Rotated matrix at 90 in clockwise direction");
        displayArray(rotateClockwise(arr));
    }
}
