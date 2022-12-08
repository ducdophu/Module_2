package Demo._ss16.BaiThi;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private StudentDao studentDao;

    /**
     * init StudentDao object and
     * read list student when init StudentManager object
     */
    public StudentManager() throws IOException {
        studentDao = new StudentDao();
        studentList = studentDao.readCSV();
    }

    public void add() throws IOException {
        int size = studentList.size();
        int id = (size > 0) ? (size + 1) : 1;
        System.out.println("Id sinh vien: " + id);
        String name = inputName();
        int age = inputAge();
        String address = inputAddress();
        float gpa = inputGpa();
        Student student = new Student(id, name, age, address, gpa);
        studentList.add(student);
        studentDao.writeCSV(studentList);
    }

    public void edit(int id) throws IOException {
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                isExisted = true;
                studentList.get(i).setName(inputName());
                studentList.get(i).setAge(inputAge());
                studentList.get(i).setAddress(inputAddress());
                studentList.get(i).setGpa(inputGpa());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            studentDao.writeCSV(studentList);
        }
    }

    public void delete(int id) throws IOException {
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
            studentDao.writeCSV(studentList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    /**
     * sort student by name
     */
    public void sortStudentByName() {
        Collections.sort(studentList, new SortStudentByName());
    }

    /**
     * sort student by id
     */
    public void sortStudentByGPA() {
        Collections.sort(studentList, new SortStudentByGPA());
    }

    public void show() {
        for (Student student : studentList) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%15s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%15s | ", student.getAddress());
            System.out.format("%10.1f%n", student.getGpa());
        }
    }

    public int inputId() {
        System.out.print("Nhap Id sinh vien: ");
        while (true) {
            try {
                int id = Integer.parseInt(scanner.nextLine());
                return id;
            } catch (NumberFormatException e) {
                System.out.print("Khong hop le! Nhap lai Id sinh vien: ");
            }
        }
    }

    public String inputName() {
        System.out.print("Nhap Ten sinh vien: ");
        return scanner.nextLine();
    }

    public int inputAge() {
        System.out.print("Nhap Tuoi sinh vien: ");
        while (true) {
            try {
                int age = Integer.parseInt(scanner.nextLine());
                if (age >= 0 && age <= 100) {
                    return age;
                } else {
                    System.out.print("Nhap lai Tuoi tu 0 - 100: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Khong hop le! Nhap lai Tuoi sinh vien: ");
            }
        }
    }

    public String inputAddress() {
        System.out.print("Nhap Dia chi sinh vien: ");
        return scanner.nextLine();
    }

    public float inputGpa() {
        System.out.print("Nhap Diem sinh vien: ");
        while (true) {
            try {
                float gpa = Float.parseFloat(scanner.nextLine());
                if (gpa >= 0 && gpa <= 10) {
                    return gpa;
                } else {
                    System.out.print("Nhap lai Diem tu 0 - 10: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Khong hop le! Nhap lai Diem sinh vien: ");
            }
        }
    }
}
