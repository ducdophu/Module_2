package Demo._ss16.vidu;

public class Teacher extends Person {
    private double salary;

    public Teacher() {

    }

    public Teacher(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    String getInfo() {
        return String.format("%s,%s,%s,%s\n", getId(), getName(), getAge(), getSalary());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
