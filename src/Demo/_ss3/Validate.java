package Demo._ss3;

import java.util.List;
import java.util.Scanner;

public class Validate implements Vali {

    @Override
    public void add(List<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap Tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Diem: ");
        double mark = Double.parseDouble(sc.nextLine());

        Student student = new Student(name, age, mark);
        list.add(student);
    }

    @Override
    public void display(List<Student> list) {
        for (Student st : list) {
            System.out.println(st);
        }
    }

    @Override
    public void remove(List<Student> list, int i) {
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                list.remove(j);
                break;
            }
        }
    }

    @Override
    public void edit(List<Student> list, int i) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < list.size(); j++) {
            if (j == i) {
                System.out.println("Nhap moi Ten: ");
                String name = sc.nextLine();
                System.out.println("Nhap moi Tuoi: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap moi Diem: ");
                double mark = Double.parseDouble(sc.nextLine());
                list.get(j).setName(name);
                list.get(j).setAge(age);
                list.get(j).setMark(mark);
                break;
            }
        }
    }
}
