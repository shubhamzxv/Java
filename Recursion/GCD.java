package Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 15;
        int y = 24;

        System.out.println(findGCD(x,y));
    }

    private static int  findGCD(int x, int y) {
        int rem = x%y;
        //System.out.println(rem +"rem");
        if (rem==0) return y;
        else {
            return findGCD(y,rem);
        }
    }
}
