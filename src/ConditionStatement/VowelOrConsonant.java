package ConditionStatement;

import java.util.Scanner;
//Write a program to check if a character is a vowel or consonant.

public class VowelOrConsonant {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value");
        char ch = scanner.next().charAt(0);
        if ("AEIOUaeiou".indexOf(ch) != -1) {
            System.out.println("The character is a vowel");
        } else {
            System.out.println("The character is a consonant");
        }
    }

}
