//Java program to perform 2×2 matrix multiplication, addition, and transpose 
//(using a switch case).
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];

        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Choose an operation: 1. Addition 2. Multiplication 3. Transpose");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                int[][] sum = addMatrices(matrix1, matrix2);
                System.out.println("Sum of matrices:");
                printMatrix(sum);
            }
            case 2 -> {
                int[][] product = multiplyMatrices(matrix1, matrix2);
                System.out.println("Product of matrices:");
                printMatrix(product);
            }
            case 3 -> {
                System.out.println("Transpose of first matrix:");
                printMatrix(transposeMatrix(matrix1));
                System.out.println("Transpose of second matrix:");
                printMatrix(transposeMatrix(matrix2));
            }
            default -> System.out.println("Invalid choice");
        }
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
             for (int j = 0; j < 2; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = m1[i][0] * m2[0][j] + m1[i][1] * m2[1][j];
            }
        }
        return result;
    }
    public static int[][] transposeMatrix(int[][] m) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[j][i] = m[i][j];
            }
        }
        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
