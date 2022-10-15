package Java_For_Loop.baitap;

public class Prime_numbers_less_than_100 {
    public static void main(String[] args) {
        System.out.println("Các Số Nguyên tố nhỏ hơn 100 là:");
        for (int number = 2; number <= 100; number++) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.print(number + " ");
            }
        }
    }
}
