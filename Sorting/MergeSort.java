package Sorting;

public class MergeSort {
    public static void main(String[] args) {

        /*
        Spaca complexity
                O(n+logn)
         Time complexity
         worst case = O(nlogn)
         best case = O(nlogn)
         Average case = O(nlogn)

         it is not inplace
         it is a stabel algorithm
          use for large data set


         */
        int[] arr = {7,6,5,4,3,100,2,356};
        mergeSort(arr,0,arr.length-1);
        for (int a: arr) {
            System.out.print(a +" ");
        }
    }

    private static void mergeSort(int[] arr, int l , int r) {
        if(l>= r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    private  static void merge (int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[mid-l+1];
        int[] right= new int[r-mid];
        int i,j,k;
        for (i = 0; i<left.length ; i++) {
            left[i] = arr[l+i];
        }
        for (i = 0; i<right.length ; i++) {
            right[i] = arr[mid+1+i];
        }
        i=0;
        j=0;
        k=l;

        while (i<n1 && j <n2){
            if (left[i] <right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        while (i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }
}