import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int[][] result = new int[2][2];

        System.out.println("Enter elements of Matrix A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Matrix Addition");
            System.out.println("2. Matrix Multiplication");
            System.out.println("3. Transpose of Matrix A");
            System.out.println("4. Transpose of Matrix B");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            result[i][j] = matrixA[i][j] + matrixB[i][j];
                        }
                    }
                    System.out.println("Result of Matrix Addition:");
                    printMatrix(result);
                    break;

                case 2:
                    
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            result[i][j] = matrixA[i][0] * matrixB[0][j] + matrixA[i][1] * matrixB[1][j];
                        }
                    }
                    System.out.println("Result of Matrix Multiplication:");
                    printMatrix(result);
                    break;

                case 3:
                    
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            result[j][i] = matrixA[i][j];
                        }
                    }
                    System.out.println("Result of Transpose of Matrix A:");
                    printMatrix(result);
                    break;

                case 4:
                    
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            result[j][i] = matrixB[i][j];
                        }
                    }
                    System.out.println("Result of Transpose of Matrix B:");
                    printMatrix(result);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
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

