package PatternProgram;
//Write a program to print a diamond pattern.

public class DimoandShape {
    public static void main(String[] args) {
        int num = 4;


        for (int i = 1; i <= num; i++) {

            for (int j = i; j < num; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = num - 1; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

