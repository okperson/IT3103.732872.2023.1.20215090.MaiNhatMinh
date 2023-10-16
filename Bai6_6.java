package lab01;

public class Bai6_6 {

    public static void main(String[] args) {
        // Initialize two matrices
        int[][] matrix1 = {
            {8, 1, 2},
            {3, 6, 7},
            {4, 5, 9}
        };

        int[][] matrix2 = {
            {3, 1, 2},
            {4, 7, 5},
            {8, 9, 6}
        };

        // Check if the two matrices have the same size
        if (areMatricesSameSize(matrix1, matrix2)) {
            // Add the two matrices
            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            // Display the results
            System.out.println("MaiNhatMinh20215090_Matrix 1:");
            printMatrix(matrix1);

            System.out.println("\nMaiNhatMinh20215090_Matrix 2:");
            printMatrix(matrix2);

            System.out.println("\nMaiNhatMinh20215090_Result of matrix addition:");
            printMatrix(resultMatrix);
        } else {
            System.out.println("MaiNhatMinh20215090_Matrices have different sizes, cannot perform addition!");
        }
    }

    // Function to check if two matrices have the same size
    private static boolean areMatricesSameSize(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
