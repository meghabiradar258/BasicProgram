package ConditionStatement;

import java.util.Scanner;
//Write a program to check if a number is positive, negative, or zero.

public class CheckNum {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.println("The number is positive");
            } else if (num < 0) {
                System.out.println("The number is negative");
            } else {
                System.out.println("The number is zero");
            }
    }


}
