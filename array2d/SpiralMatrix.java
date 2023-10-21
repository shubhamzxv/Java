package array2d;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        spirlPrint(arr);
    }

    private static void spirlPrint(int[][] arr) {
        int r= arr[0].length , c = arr.length;
        int leftcol = 0 ,rightcol=c-1 ,toprow= 0, bottomrow=r-1  ;
        int count= 0;
        while (count<r*c) {
            for (int i = leftcol; i <= rightcol && count<r*c; i++) {
                System.out.print(arr[toprow][i] + " ");
                count++;
            }
            //if (count<r*c) return;
            toprow++;
            for (int i = toprow; i <= bottomrow && count<r*c; i++) {
                System.out.print(arr[i][rightcol] + " ");
                count++;
            }
            rightcol--;
            //if (cout<=arr[0].length*arr.length) return;
            for (int i = rightcol; i >= leftcol && count<r*c; i--) {
                System.out.print(arr[bottomrow][i] + " ");
                count++;
            }
            bottomrow--;
            //if (cout<=arr[0].length*arr.length) return;
            for (int i = bottomrow; i >=toprow && count<r*c; i--) {
                System.out.print(arr[i][leftcol]+" ");
                count++;
            }
            leftcol++;
        }
    }
}
