package recursion;

import java.util.Scanner;

public class Power {
    public static int pow(int x,int y){// time complexity O(y) because it call the recursive function  y times
        if(y==0) return 1;

        return x*pow(x, y-1);
    }
    public static int pow2(int x, int y){// time complexity O(y) because it call the recursive function  y times

        if(y%2==0){
            if (y==0) return 1;
            return pow2(x,y/2)*pow2(x,y/2);
        }
        else {
            if(y==0) return 1*x;
            return pow2(x,y/2)*pow2(x,y/2)*x;
        }
    }
    public static int pow3(int x, int y){
        if (y==0) return 1;
        int smallPow = pow3(x,y/2);
        if (y%2==0){
            return smallPow*smallPow;
        }
        return x*smallPow*smallPow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(pow3(x,y));
    }
}
