package Demo._ss5;

public class StudentSTest extends Students {
    private String email;


    public StudentSTest(){};
    public StudentSTest(int age, String name, String email) {
        super(age, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentSTest{" +
                "Name='" + super.getName() + '\'' +
                ", age='" + getAge()+ '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StudentSTest studentSTest = new StudentSTest(23, "A", "NguyenVanA");
        StudentSTest studentSTest1 = new StudentSTest();
        System.out.println(studentSTest);
        System.out.println(studentSTest1);

    }

}
