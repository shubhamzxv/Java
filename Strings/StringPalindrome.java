package Strings;
import java.util.Scanner;

import static Strings.ReverseString.reverseString;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
//        isPalindrome(s);
        System.out.println(isPalindrome2(s,0,s.length()-1));
    }

    private static boolean isPalindrome2(String s, int i, int length) {
        if(i>=length){
            return true;
        }
        if (s.charAt(i)== s.charAt(length)){
            return isPalindrome2(s,i+1, length-1);
        }else return false;
    }

    private static void isPalindrome(String s) {
        String rev= reverseString(s,0);
        if(s.equals(rev)){
            System.out.printf("%s is plaindrome",s);
        }else
            System.out.printf("%s is not a palindrome",s);
    }
}
