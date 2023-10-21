package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,100,2,356};
        insertionSort(arr);
        for (int a: arr) {
            System.out.print(a +" ");
        }
    }

    private static void insertionSort(int[] arr) {
        /*
        Real Life Examples
        card, shirt size

        Space complexity = O(1) (it is an inplace algorithm)

        time complexity
        worst = O(n^2)
        average = O(n^2)
        best = O(n)

        it is an stable algorithm

        Application of insertion sort
        for sorting some part is already sorted array

         */
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] <arr[j-1] ; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
}
