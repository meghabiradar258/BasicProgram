package ConditionStatement;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" number ");
        int num = scanner.nextInt();
        int original = num, rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (original == rev) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not  palindrome");
        }
    }

}
