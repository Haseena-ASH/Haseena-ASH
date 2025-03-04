package basicsjava;

import java.util.Scanner;

public class MatrixMultiplication {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter values for Matrix A (2x2):");
	        int[][] A = new int[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                A[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("Enter values for Matrix B (2x2):");
	        int[][] B = new int[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                B[i][j] = scanner.nextInt();
	            }
	        }

	        int[][] result = new int[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                result[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
	            }
	        }

	        // Display the result
	        System.out.println("Resulting Matrix:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
}
