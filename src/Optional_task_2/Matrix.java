package Optional_task_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


public  class  Matrix {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter integer > 0 to set matrix lines "
                + "and columns number, and press <Enter>:");
        int numberMatrixLinesAndColumns = scanner.nextInt();

        int[][] matrix = new int[numberMatrixLinesAndColumns]
                [numberMatrixLinesAndColumns];

        System.out.println("Enter any integer number to set range for filling matrix "
                + "fields and press <Enter>:");
        int numberToFillMatrix = scanner.nextInt();

        System.out.print("\n");
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * numberToFillMatrix);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\n");
        System.out.println("Sorting matrix descending by it's lines numbers sum:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Arrays.sort(matrix, Comparator.comparingInt(linesNumbersSum
                        -> 1 - IntStream.of(linesNumbersSum).sum()));
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

