package Sorting;

import static Sorting.QuickSort.*;
public class CountSort {
    static int findMax(int[] arr){
         int max = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]>max){
                 max=arr[i];
             }
         }
         return max;
     }
    static void basicCountSort(int[] arr){
         int max = findMax(arr);
         int[] count = new int[max+1];
         for (int i = 0; i < arr.length; i++) {
             count[arr[i]]++;// for counting the frequency of data set
         }
         int k=0;
         for (int i = 0; i < count.length; i++) {
             for (int j = 0; j < count[i]; j++) {
                arr[k++]= i;
             }
         }
     }
    static void CountSort(int[] arr){
        int max = findMax(arr);
        int[] output= new int[arr.length];
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;// for counting the frequency of data set
        }
        // make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        
        // Find the index of each element in the original array and put it in output array
        for (int i = arr.length-1; i >= 0 ; i--) {
            int idx= count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copying output to arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,2,3,100,20,356};
        display(arr);
        System.out.println("\nAfter Count Sort");
        CountSort(arr);
        display(arr);
    }
}