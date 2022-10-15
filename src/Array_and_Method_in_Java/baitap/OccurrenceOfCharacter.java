package Array_and_Method_in_Java.baitap;

import java.util.Scanner;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String str = "Toi ten la Do Phu Duc, hien toi dang la hoc vien cua Trung tam dao tao lap trinh CodeGym";
        System.out.print("Enter a character you want to find the occurrence: ");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==c) count++;
        }
        if (count != 0) {
            System.out.println("Occurrence of this character is: " + count);
        } else {
            System.out.println("Not found this character in the string.");
        }
    }
}
