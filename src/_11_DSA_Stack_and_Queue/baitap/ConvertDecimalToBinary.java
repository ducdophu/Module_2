package _11_DSA_Stack_and_Queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số Nguyên dương: ");
        int numbers = scanner.nextInt();
        int input = numbers;
        Stack<Integer> stack = new Stack<>();

        while (numbers > 0) {
            stack.push(numbers % 2);
            numbers /= 2;
        }

        System.out.print("Số " + input + " sau khi chuyển sang hệ Nhị phân: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
