package Demo._ss1.THICUOIKY.model;

public class TaiKhoanTietKiem extends TaiKhoan {

    private double soTienGui;
    private String ngayGui;
    private double laiSuat;
    private int kyHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, double soTienGui, String ngayGui, double laiSuat, int kyHan) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGui = soTienGui;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kyHan = kyHan;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKyHan() {
        return kyHan;
    }

    public void setKyHan(int kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n", getId(), getMaTaiKhoan(), getTenChuTaiKhoan(), getNgayTaoTaiKhoan(), getSoTienGui(), getNgayGui(), getLaiSuat(), getKyHan());
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + getId() +
                ", maTaiKhoan='" + getMaTaiKhoan() + '\'' +
                ", tenChuTaiKhoan='" + getTenChuTaiKhoan() + '\'' +
                ", ngayTaoTaiKhoan='" + getNgayTaoTaiKhoan() + '\'' +
                ", soTienGui=" + soTienGui +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiSuat=" + laiSuat +
                ", kyHan=" + kyHan +
                '}';
    }
}
