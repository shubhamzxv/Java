package Sorting;

import static Sorting.QuickSort.display;

public class RadixSort {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // calculated frequency of data
        for(int i = 0; i < arr.length; i++){ // Make frequency array
            count[(arr[i]/place)%10]++;
        }
        // Make prefix sum array of count array
        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }

        // generating output array form count and arr
        for(int i = n-1; i >= 0; i--){
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copy all elements of output to arr
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr){
        int max = findMax(arr); // get maximum element
        // apply counting sort to sort elements based on place value
        for(int place = 1; max/place > 0; place *= 10){
            countSort(arr, place);
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,2,3,100,20,356};
        display(arr);
        System.out.println("\nAfter Radix Sort");
        radixSort(arr);
        display(arr);
    }
}
