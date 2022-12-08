package Demo._ss16.BaiThi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public static final String FILE_PATH = "/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/Demo/_ss16/BaiThi/Student.csv";
    public static final String FILE_PATH1 = "/Users/phuducdo/Desktop/phuducdo/CODEGYM/Module_2/src/Demo/_ss16/BaiThi/Student_Update.csv";

    public List<Student> readCSV() throws IOException {
        List<Student> studentList = new ArrayList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String[] temp;
        Student student;
        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            int age = Integer.parseInt(temp[2]);
            String address = temp[3];
            float gpa = Float.parseFloat(temp[4]);
            student = new Student(id, name, age, address, gpa);
            studentList.add(student);
        }
        buff.close();
        return studentList;
    }

    public void writeCSV(List<Student> studentList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH1);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (Student student : studentList) {
            buff.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getAddress() + "," + student.getGpa() + "\n");
        }
        buff.close();
    }
}
