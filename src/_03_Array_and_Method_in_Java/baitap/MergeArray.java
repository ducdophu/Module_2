package _03_Array_and_Method_in_Java.baitap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int size1;
        int size2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array 1: ");
        size1 = scanner.nextInt();
        arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 1: ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.print("Enter a size of array 2: ");
        size2 = scanner.nextInt();
        arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element " + (i + 1) + " of array 2: ");
            arr2[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.print("Elements in array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();


        System.out.print("Elements in array 2: ");
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int j = 0; j < arr3.length; j++) {
            if (j < arr1.length) {
                arr3[j] = arr1[j];
            } else {
                arr3[j] = arr2[j- arr1.length];
            }
        }

        System.out.print("New array: ");
        for (int j = 0; j < arr3.length; j++) {
            System.out.print(arr3[j] + " ");
        }
    }
}
