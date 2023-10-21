package Sorting;

import java.sql.SQLOutput;

public class QuickSort {
    public static void main(String[] args) {
        /*
        Space complexity
         avg/Best case =>       O(logn)
         worst case => O(n)

         Time complexity
         worst case = O(n^2) (we can always avoid it by using randamize pivot)
         best case = O(nlogn)
         Average case = O(nlogn)

         it is inplace
         it is not a stable algorithm
         Application:-
         use for large data set


         */
        int[] arr = {7,6,5,4,2,3,100,2,356};
        display(arr);
        System.out.println("\nAfter Quick Sort");
        quickSort(arr,0,arr.length-1);
        display(arr);
    }

    private static void quickSort(int[] arr, int str, int end) {
        if(str>=end) return ;
        int pi=partition(arr, str, end);
        quickSort(arr, str, pi-1);
        quickSort(arr, pi+1, end);
    }

    private static int partition(int[] arr, int str, int end) {
        // Fist step = set the first element at its correct index
        int pivot = arr[str];
        int count = 0 ;
        for (int i = str+1; i < end - str + 1; i++) {
            if(arr[i] <= pivot){
                count++;
            }
        }
        int pivotIndx = count+ str;
        swap(arr, str, pivotIndx);

        // Second step = Arrange all the small number on the left hand side and other on right
        int i = str, j= end;
        while (i<pivotIndx && j>pivotIndx){
            while (arr[i]<= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i<pivotIndx && j>pivotIndx){
                swap(arr, i,j);
                i++;
                i--;
            }
        }
        return  pivotIndx;
    }
    static void swap(int[] arr, int a , int b){
        int temp= arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
    static void display(int[] arr){
        for (int s: arr ) {
            System.out.print(s+" ");
        }
    }
}