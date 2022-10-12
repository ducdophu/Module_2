package Introduction_to_Java.baitap;

import java.util.Scanner;

public class Currency_converter_app {
    public static void main(String[] args) {
        int exchange_rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tien muon doi theo USD: ");
        int usd = scanner.nextInt();
        int vnd = usd * exchange_rate;
        System.out.println("Gia tri VND tuong ung la: " + vnd);
    }
}
