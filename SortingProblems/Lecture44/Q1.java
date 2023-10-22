package SortingProblems.Lecture44;

import static Sorting.QuickSort.display;

public class Q1 {
    public static void main(String[] args) {

        //swap two num to make array sorted
        int[] arr = {3,8,6,7,5,9,10};
        sort(arr);
        display(arr);
    }

    private static void sort(int[] arr) {
        if(arr.length<2) return;
        int x = -1, y=-1;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<arr[i-1]){
                if (x==-1){
                    x = i-1;
                    y = i;
                }
                else {
                    y = i;
                }
            }
        }
        int temp= arr[x];
        arr[x]= arr[y];
        arr[y] = temp;
    }
}
