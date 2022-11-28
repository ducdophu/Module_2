package _03_Array_and_Method_in_Java.baitap;

import java.util.Scanner;

public class SumOfElementsInSpecifiedColumn {
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

        float sum = 0;
        System.out.print("Enter a column you want to calculate the sum: ");
        int input = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            sum += array[i][input];
        }
        System.out.println("Sum of elements in a specified column is: " + sum);
    }
}
