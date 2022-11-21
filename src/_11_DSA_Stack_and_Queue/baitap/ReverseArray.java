package _11_DSA_Stack_and_Queue.baitap;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 23, 45, 63, 71, 82, 28, 93, 88};
        System.out.println("Các phần tử của mảng ban đầu: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("---------");

        Stack<Integer> stack = new Stack<>();
        for (int element : arr) {
            stack.push(element);
        }
        System.out.println("Các phần tử của Stack sau khi được thêm từ mảng: ");
        System.out.println(stack);
        System.out.println("---------");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Các phần tử của mảng sau khi đảo ngược: ");
        System.out.println(Arrays.toString(arr));
    }
}
