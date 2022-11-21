package _11_DSA_Stack_and_Queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi String bất kỳ: ");
        String str = scanner.nextLine();
        int n = str.length();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(str.charAt(i));
        }
        System.out.println(stack);

        String strs = "";
        while (!stack.isEmpty()) {
            strs += stack.pop();
        }

        System.out.println("Chuỗi sau khi được đảo ngược: ");
        System.out.println(strs);
    }
}
