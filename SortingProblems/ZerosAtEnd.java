package SortingProblems;

public class ZerosAtEnd {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 2, 1};
        zeroAtEnd(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
    static void zeroAtEnd(int @org.jetbrains.annotations.NotNull [] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;// flag for checking if there is any swap or not
            for (int j = 0; j < n - i - 1; j++) {
                // last i elements are already at correct sorted position;
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) return;
        }
    }
}