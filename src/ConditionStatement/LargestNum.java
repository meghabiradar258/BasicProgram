package ConditionStatement;

import java.util.Scanner;

//Write a program to find the largest of three numbers.
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a");
        int a=sc.nextInt();
        System.out.println("b");
        int b=sc.nextInt();
        System.out.println("c");
        int c=sc.nextInt();
        ///another way
        int greatest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The greatest number is " + greatest);

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }

    }
}
