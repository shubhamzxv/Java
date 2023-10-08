package Strings;
import java.util.Scanner;

import static Strings.ReverseString.reverseString;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        isPalindrome(s);
//        isPlaind
    }

    private static void isPalindrome(String s) {
        String rev= reverseString(s,0);
        if(s.equals(rev)){
            System.out.printf("%s is plaindrome",s);
        }else
            System.out.printf("%s is not a palindrome",s);
    }
}
