package Strings;

import java.util.Scanner;

public class StringRecursion {
    public static void main(String[] args) {
         //remove ocurance of a from string through recursion
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(removeA(s,0)); // with passing index
        System.out.println(removeA2(s));// without passing index
    }

    private static String removeA2(String s) {
        // base case
        if (s.isEmpty()) return "";

        // self work and recurance reation
        if(s.charAt(0) == 'a'){
            return removeA2(s.substring(1));
        }else {
            return s.charAt(0)+removeA2(s.substring(1));
        }
    }

    private static String removeA(String s, int i) {
        // base case
        if (s.length()==i || s == null ) return "";

        // self work and recurance reation
        if(s.charAt(i) == 'a'){
            return removeA(s,i+1);
        }else {
            return s.charAt(i)+removeA(s,i+1);
        }
    }
}
