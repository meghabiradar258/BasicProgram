package ConditionStatement;

import java.util.Scanner;

//Write a program to print the day of the week based on a number (1-7).
public class WeekDay {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number ");
            int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }



    }
}
