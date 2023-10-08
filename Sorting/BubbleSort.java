package Sorting;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3};
        bubbleSort(arr);
        for (int a: arr) {
            System.out.print(a +" ");
        }
    }
    static void bubbleSort(int[] arr){
        /*
        time complexity
        best = n
        average =n2
        worst =n2

        it is an stable alogorithm ( because it donot change the order of two same elements)

        it is an in-place algorithm
         */

        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            boolean flag = true;// flag for checking if there is any swap or not
            for (int j = 0; j < n-i-1; j++) {
                // last i elements are already at correct sorted position;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) return;
        }
    }
}
