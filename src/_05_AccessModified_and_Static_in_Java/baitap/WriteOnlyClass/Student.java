package _05_AccessModified_and_Static_in_Java.baitap.WriteOnlyClass;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
