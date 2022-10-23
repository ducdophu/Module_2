package _05_AccessModified_and_Static_in_Java.baitap.WriteOnlyClass;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Do");
        student.setClasses("A07");

        System.out.println(student);
    }
}
