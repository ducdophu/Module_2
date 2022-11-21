package _12_Java_Collection_Framework.thuchanh.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nguyen Van D", 19, "Da Nang");
        Student student1 = new Student("Nguyen Van B", 34, "Ha Noi");
        Student student2 = new Student("Nguyen Van A", 23, "Dong Nai");
        Student student3 = new Student("Nguyen Van C", 52, "Hue");

        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(student);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);

        Collections.sort(listStudent, Collections.reverseOrder());
        for (Student students : listStudent) {
            System.out.println(students);
        }

        System.out.println("-----------------");

        Collections.sort(listStudent, new AgeComparator());
        for (Student students : listStudent) {
            System.out.println(students);
        }
    }
}
