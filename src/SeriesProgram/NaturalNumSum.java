package SeriesProgram;

import java.util.Scanner;
// Program 3: Sum of the first n natural numbers
public class NaturalNumSum {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value  ");
            int n = sc.nextInt();
            int sum = n * (n + 1) / 2;

            System.out.println("Sum of first " + n );
            System.out.println( " natural numbers " + sum);
        }
}
