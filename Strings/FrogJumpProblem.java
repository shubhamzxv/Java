package Strings;

public class FrogJumpProblem {
    public static void main(String[] args) {
        int[] arr = {10,20,40,20,};
        int n= arr.length;
        System.out.println(findMin(arr,n,0));
    }

    private static int findMin(int[] arr, int n, int idx) {
        if (idx ==n-1) return 0;

        int op1 = findMin(arr,n,idx+1) + Math.abs(arr[idx+1]-arr[idx]);
        if(idx ==n-2) return op1;
        int op2 = findMin(arr, n,idx+2) + Math.abs(arr[idx+1]-arr[idx]);
        return  Math.min(op1,op2);

    }
}
