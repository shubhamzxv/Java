package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(reverseString(s,0));
    }

    static String reverseString(String s, int indx) {
        if(s.length()==indx) return "";

        return reverseString(s,indx+1) + s.charAt(indx);
    }
}
