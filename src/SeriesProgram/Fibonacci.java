package SeriesProgram;

import java.util.Scanner;
//Write a program to print the Fibonacci series up to a given number.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series " + a + ", " + b);
        while (b <= n) {
            int c = a + b;

            if (c > n)
                break;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
