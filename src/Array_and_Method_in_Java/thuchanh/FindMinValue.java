package Array_and_Method_in_Java.thuchanh;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        int[] array = {8, 5, 7, 9, 33, 77, 99, 11, 23};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
