package Recursion;

import java.util.Scanner;

//import static Recursion.SumOfDigits.findSum;

public class AlternateSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // finding the alternate sum series of the given number till 1 through recursion lecture 30
        // 1-2+3-4+5-6
        System.out.println(findAlternateSum(num));
    }

    private static int findAlternateSum(int num) {
        if (num ==0) return 0;
        if(num%2==0){
            return findAlternateSum(num-1)-num;
        }
        else {
            return findAlternateSum(num-1)+num;
        }

    }
}
