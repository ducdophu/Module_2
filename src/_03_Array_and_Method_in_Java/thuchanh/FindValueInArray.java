package _03_Array_and_Method_in_Java.thuchanh;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Zidane", "Ronaldo", "Totti", "Messi", "Rooney"};
        System.out.print("Enter a name you want to search: ");
        String name = scanner.nextLine();
        int position = -1;
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                position = i;
            }
        }
        if (position != -1) {
            System.out.println("Position of the name in the list is: " + (position + 1));
        } else {
            System.out.println("Not found " + name + " in the list");
        }
    }
}
