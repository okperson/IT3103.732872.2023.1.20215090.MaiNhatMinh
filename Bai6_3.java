package lab01;

import java.util.Scanner;

public class Bai6_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the height of the triangle
        System.out.print("MaiNhatMinh20215090_Enter the height of the triangle: ");
        int n = scanner.nextInt();
        scanner.close();

        // Build a function to print the triangle
        printTriangle(n);
    }

    // Function to print a triangle with 'n' rows
    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces in each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars in each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}

