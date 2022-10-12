package Array_and_Method_in_Java.baitap;

import java.util.Scanner;

public class Remove_element_in_array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 2, 11, 9, 8};

        System.out.print("Elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the value you want to delete: ");
        int input = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) index = i;
        }

        if (index == -1) {
            System.out.print("Value not found in array!");
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.print("New array: ");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
