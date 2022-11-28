package _16_IO_TextFile.thuchanh.ReadFileExample;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) throw new FileNotFoundException("Khong the tim thay file duoc chi dinh...");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();
            System.out.println("Sum: " + sum);
        } catch (FileNotFoundException e) {
            System.err.println("Error 1: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error 2: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        /* File path:
         * /Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/_16_IO_TextFile/thuchanh/ReadFileExample/numbers
         */
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
