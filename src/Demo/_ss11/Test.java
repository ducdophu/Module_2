package Demo._ss11;

public class Test {

    public static void main(String[] args) {
        SinhVien[] sinhVien = new SinhVien[4];
        sinhVien[0] = new SinhVien(100, "Nguyen Van A", "Lop 1", 9.4);
        sinhVien[1] = new SinhVien(100, "Nguyen Van A", "Lop 1", 9.4);
        sinhVien[2] = new SinhVien(102, "Nguyen Van C", "Lop 1", 9.5);
        sinhVien[3] = new SinhVien(103, "Nguyen Van D", "Lop 1", 9.2);
/*
*
 Arrays.sort(sinhVien);
 for (SinhVien sv : sinhVien) {
 System.out.println(sv);
 }*/
        System.out.println(sinhVien[0] == sinhVien[1]);
        System.out.println(sinhVien[0].equals(sinhVien[1]));
    }
}
