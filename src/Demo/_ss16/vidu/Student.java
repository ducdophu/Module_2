package Demo._ss16.vidu;

public class Student extends Person {
    private double mark;

    public Student() {
    }

    public Student(int id, String name, int age, double mark) {
        super(id, name, age);
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s\n", getId(), getName(), getAge(), getMark());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", mark=" + mark +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student(1,"nguyen",34,8);
        Student student1 = new Student(1,"nguyen",34,8);

        System.out.print(student.getInfo());
        System.out.print(student1.getInfo());

    }
}
