package SortingProblems.Lecture44;

import static Sorting.QuickSort.display;
import static Sorting.QuickSort.swap;

public class DutchProblem {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0,1,2,0,2,0};
        dutchSort(arr);
        display(arr);
    }

    private static void dutchSort(int[] arr) {
        int low=0,mid=0,hi=arr.length-1;
        while (mid<hi) {
            if (arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else if (arr[mid] == 2) {
                swap(arr,mid,hi);
                hi--;
            }
        }
    }
}
