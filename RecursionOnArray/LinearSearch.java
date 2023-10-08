package RecursionOnArray;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,3,4,8,8};
        System.out.println(isPresent(arr,8,0));
        System.out.println(isPresentAtIndex(arr,8,0));
        returnAllIndeces(arr,8,0);
    }

    private static boolean isPresent(int[] arr, int target, int i) {
        if (i+1==arr.length) return false;
        if( arr[i]==target) return true;
        else return isPresent(arr,target, i+1);
    }

    private static int isPresentAtIndex(int[] arr, int target, int i) {
        if (i+1==arr.length) return -1;
        if( arr[i]==target) return i;
        else return isPresentAtIndex(arr,target, i+1);
    }

    private static void returnAllIndeces(int[] arr, int target, int i) {

        if( arr[i]==target) System.out.print(i+" ");
        if (i+1==arr.length) return;
        returnAllIndeces(arr,target, i+1);
    }
}
