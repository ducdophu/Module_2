package _16_IO_TextFile.baitap.ReadFile_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static final String FILE_PATH = "/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/_16_IO_TextFile/baitap/ReadFile_csv/countries";
    public static final String FILE_PATH1 = "/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/_16_IO_TextFile/baitap/ReadFile_csv/countries_update";

    public static List<Country> readCSV() throws IOException {
        List<Country> countryList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Country country;
        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            // System.out.println(Arrays.toString(temp));
            int id = Integer.parseInt(temp[0]);
            String code = temp[1];
            String name = temp[2];

            country = new Country(id, code, name);
            countryList.add(country);
        }
        buff.close();
        return countryList;
    }

    public static void writeCSV(Country country) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH1, true);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        buff.write(country.getId() + "," + country.getCode() + "," + country.getName() + "\n");
        buff.close();
    }
}
