package SeriesProgram;
//Write a program to print the prime numbers in a given range.

import java.util.Scanner;

public class PrimeNumInRange {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Start num ");
            int start = sc.nextInt();

            System.out.print("end num ");
            int end = sc.nextInt();

            System.out.println("range" + start + " - " + end + " are:");
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }

        }


        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
