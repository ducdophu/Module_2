package _01_IntroductiontoJava.baitap;

import java.util.Scanner;

public class CurrencyConvertApp {
    public static void main(String[] args) {
        int exchangeRate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tien muon doi theo USD: ");
        int usd = scanner.nextInt();
        int vnd = usd * exchangeRate;
        System.out.println("Gia tri VND tuong ung la: " + vnd);
    }
}
