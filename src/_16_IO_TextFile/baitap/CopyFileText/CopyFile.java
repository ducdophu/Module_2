package _16_IO_TextFile.baitap.CopyFileText;

import java.io.*;
import java.util.ArrayList;

public class CopyFile {
    public static final String SOURCE_FILE_PATH = "/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/_16_IO_TextFile/baitap/CopyFileText/Source";
    public static final String TARGET_FILE_PATH = "/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/_16_IO_TextFile/baitap/CopyFileText/Target";

    public static ArrayList<String> readFile() throws IOException {
        ArrayList<String> content = new ArrayList<>();
        FileReader fileReader = new FileReader(SOURCE_FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        while ((line = buff.readLine()) != null) {
            content.add(line);
        }
        buff.close();
        return content;
    }

    public static int writeFile(ArrayList<String> content) throws IOException {
        int count = 0;
        FileWriter fileWriter = new FileWriter(TARGET_FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (String contentLine : content) {
            buff.write(contentLine + "\n");
            count += contentLine.length();
        }
        buff.close();
        return count;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> content = readFile();
//        for (String contentLine : content) {
//            System.out.println(contentLine);
//        }

        System.out.println(writeFile(content));
    }
}
