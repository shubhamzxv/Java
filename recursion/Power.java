package recursion;

import java.util.Scanner;

public class Power {
    public static int pow(int x,int y){
        if(y==0) return 1;

        return x*pow(x, y-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(pow(x,y));
    }
}
