package Demo._ss16.BaiThi;

import java.util.Comparator;

public class SortStudentByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }
}
