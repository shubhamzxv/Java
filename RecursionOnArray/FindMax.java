package RecursionOnArray;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1};
        System.out.println(findMax(arr,0));
        System.out.println(sumOfAllElements(arr,0));

    }

    private static int  sumOfAllElements(int[] arr, int i) {
        if (i+1 == arr.length) return arr[i];
        return arr[i] + sumOfAllElements(arr, i+1);
    }

    private static int  findMax(int[] arr, int i) {
        if(i+1 == arr.length) return arr[i];
        return Math.max(arr[i],findMax(arr,i+1));
    }
}
