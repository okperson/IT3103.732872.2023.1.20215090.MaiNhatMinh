package lab01;

import java.util.Arrays;

public class Bai6_5 {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = new int[] {3, 17, 9, 14, 20, 18, 15, 16, 22, 21, 23, 24};
        int sum = 0; // Initialize a variable to store the sum of the elements

        // Sort the array
        Arrays.sort(numbers);

        // Calculate the sum of the elements in the array
        for (int number : numbers) {
            sum += number;
        }

        // Display the results
        System.out.println("MaiNhatMinh20215090_Mang da sap xep: " + Arrays.toString(numbers));
        System.out.println("MaiNhatMinh20215090_Gia tri trung binh cua mang la: " + (double) sum / numbers.length);
    }
}
