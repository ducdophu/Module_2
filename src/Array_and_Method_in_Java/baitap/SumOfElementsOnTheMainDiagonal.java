package Array_and_Method_in_Java.baitap;

import java.util.Scanner;

public class SumOfElementsOnTheMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows and columns (rows = columns): ");
        int value = scanner.nextInt();
        System.out.println();
        float[][] array = new float[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print("Element array[" + i + "][" + j + "] is: ");
                array[i][j] = scanner.nextFloat();
            }
        }
        System.out.println();

        System.out.println("Array 2D has been entered: ");
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        float sum = 0;
        for (int i = 0; i < value; i++) {
            sum += array[i][i];
        }
        System.out.println("Sum of elements on the main diagonal is: " + sum);
    }
}
