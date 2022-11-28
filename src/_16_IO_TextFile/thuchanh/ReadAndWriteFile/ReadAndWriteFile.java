package _16_IO_TextFile.thuchanh.ReadAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public List<Integer> readFile(String filePath) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) throw new FileNotFoundException("Khong the tim thay file duoc chi dinh...");

            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                list.add(Integer.valueOf(line));
            }
            reader.close();
            System.out.println("Danh sach cac so la: " + list);
        } catch (FileNotFoundException e) {
            System.err.println("Error 1: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error 2: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public int findMax(List<Integer> list) {
        int size = list.size();
        int max = list.get(0);
        for (int i = 1; i < size; i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }

    public void writeFile(String filePath, int maxValue) {
        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("\nMax value is: " + maxValue);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String filePath = "/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/_16_IO_TextFile/thuchanh/ReadAndWriteFile/numbers";
        List<Integer> list = readAndWriteFile.readFile(filePath);
        int maxValue = readAndWriteFile.findMax(list);
        readAndWriteFile.writeFile("/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/_16_IO_TextFile/thuchanh/ReadAndWriteFile/result", maxValue);
    }
}
