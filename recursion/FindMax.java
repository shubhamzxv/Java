package recursion;

public class FindMax {
    public static void main(String[] args) {
        int[] arr= {5,6,8,10,94};

        int ans = findMax(arr,0);
        System.out.println(ans);
    }

    private static int findMax(int[] arr, int i) {
        if(i==arr.length-1) return arr[i];
        int smallAns= findMax(arr,i+1);

        return Math.max(arr[i], smallAns);
    }
}
