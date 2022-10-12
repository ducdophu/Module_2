package Java_For_Loop.baitap;

import java.util.Scanner;

public class First_20_primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn in ra bao nhiêu Số Nguyên tố đầu tiên: ");
        int N = scanner.nextInt();

        int number = 1;
        for (int countN = 0; countN < N; number++) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.print(number + " ");
                ++countN;
            }
        }
    }
}
