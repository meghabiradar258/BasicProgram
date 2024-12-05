package SeriesProgram;

import java.util.Scanner;
//Write a program to print the sum of the first n odd numbers.

public class SumOfOddNum {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value  ");
            int n = sc.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++)
            {
                if (i % 2 != 0) {
                    sum += i;
                }
            }

            System.out.println("The sum of odd numbers  " + n + " is" + sum);

        }
    }

