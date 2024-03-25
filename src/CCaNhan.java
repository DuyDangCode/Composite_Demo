public class CCaNhan implements IDonVi {
    private double doanhThu = 0;

    public CCaNhan(int soLuong, double phanTramLoiNhuan, double giaTien ) {
        this.doanhThu = soLuong * giaTien * phanTramLoiNhuan;
    }

    public double tinhDoanhThu() {
        return doanhThu;
    }
}
