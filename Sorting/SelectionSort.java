package Sorting;


public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,100,2,356};
        selectionSort(arr);
        for (int a: arr) {
            System.out.print(a +" ");
        }
    }
    private static void selectionSort(int[] arr) {
        /*
        Space complexity = O(1)

        Best Time complexity = O(n^2)
        Worst Time complexity = O(n^2)
        Average Time complexity = O(n^2)


        it is not and stable algorithm
        it is an in place algo

         */


        for (int i = 0; i < arr.length-1; i++) {
            int minIdx= i;
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx]= arr[i];
            arr[i]= temp;

        }
    }
}
