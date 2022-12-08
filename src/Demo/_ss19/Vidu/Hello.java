package Demo._ss19.Vidu;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        String gender = "Unknown";
        boolean flagGender = false;
        do {
            try {
                System.out.println("Choice student's gender");
                System.out.println("1. Male");
                System.out.println("2. Female");
                choice = Integer.parseInt(scanner.nextLine());
                flagGender = true;
                switch (choice) {
                    case 1 -> gender = "Male";
                    case 2 -> gender = "Female";
                    default -> System.out.println("Invalid choice, please try again");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input, please enter again!");
            }
        } while (!flagGender || choice < 1 || choice > 2);
        System.out.println(gender);
    }
}
