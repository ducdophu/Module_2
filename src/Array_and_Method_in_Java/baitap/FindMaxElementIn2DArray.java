package Array_and_Method_in_Java.baitap;

import java.util.Scanner;

public class FindMaxElementIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int column = scanner.nextInt();
        System.out.println();
        float[][] array = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Element array[" + i + "][" + j + "] is: ");
                array[i][j] = scanner.nextFloat();
            }
        }
        System.out.println();

        System.out.println("Array 2D has been entered: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        float max = array[0][0];
        for (float[] row_float : array) {
            for (float column_float : row_float) {
                if (column_float > max) {
                    max = column_float;
                }
            }
        }
        System.out.println("Max value of Array 2D is: " + max);
    }
}
