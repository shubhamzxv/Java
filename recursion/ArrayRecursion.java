package recursion;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,8};
        printArray(arr,0);
    }

    private static void printArray(int[] arr, int i) {
        if(i==arr.length) return;
        System.out.println(arr[i]);
        printArray(arr,i+1);
    }
}
