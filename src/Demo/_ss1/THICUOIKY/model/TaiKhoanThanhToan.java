package Demo._ss1.THICUOIKY.model;

public class TaiKhoanThanhToan extends TaiKhoan {

    private String soThe;
    private double soTienDaCo;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe, double soTienDaCo) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienDaCo = soTienDaCo;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public double getSoTienDaCo() {
        return soTienDaCo;
    }

    public void setSoTienDaCo(double soTienDaCo) {
        this.soTienDaCo = soTienDaCo;
    }

    @Override
    public String getInfor() {
        return String.format("%s,%s,%s,%s,%s,%s\n", getId(), getMaTaiKhoan(), getTenChuTaiKhoan(), getNgayTaoTaiKhoan(), getSoThe(), getSoTienDaCo());
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + getId() +
                ", maTaiKhoan='" + getMaTaiKhoan() + '\'' +
                ", tenChuTaiKhoan='" + getTenChuTaiKhoan() + '\'' +
                ", ngayTaoTaiKhoan='" + getNgayTaoTaiKhoan() + '\'' +
                ", soThe='" + soThe + '\'' +
                ", soTienDaCo=" + soTienDaCo +
                '}';
    }
}
