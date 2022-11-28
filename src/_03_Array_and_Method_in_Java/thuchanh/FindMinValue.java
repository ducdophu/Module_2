package _03_Array_and_Method_in_Java.thuchanh;

public class FindMinValue {
    public static void main(String[] args) {
        int[] array = {8, 5, 7, 9, 2, 77, 99, 11, 23};
        System.out.println("The smallest element in the array is: " + minValue(array));
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
        return min;
    }
}
