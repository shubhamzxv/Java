package SortingProblems;

public class SortLexicographicaly {
    public static void main(String[] args) {
        String[] fruits = {"papaya","lime","watermelon","apple","mango","kiwi"};

        sortString(fruits);
        for (String s: fruits    ) {
            System.out.print(s + " ");

        }
    }

    private static void sortString(String[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx= i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIdx]) < 0){
                    minIdx = j;
                }
            }
            String temp = arr[minIdx];
            arr[minIdx]= arr[i];
            arr[i]= temp;

        }
    }
}
