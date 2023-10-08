package RecursionOnArray;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,34,45};

        printMyArray(arr,0);
    }
    public static void printMyArray(int[] arr,int a){

        if(a == arr.length ) return;
        System.out.println(arr[a]);
        printMyArray(arr,a+1);
    }
}
