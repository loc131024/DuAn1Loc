package banquanao.model;

import javax.swing.table.DefaultTableModel;

public class sanpham {

    private String masp, tensp;
    private int slSp;

    public sanpham() {
    }

    public sanpham(String masp, String tensp, int slSp) {
        this.masp = masp;
        this.tensp = tensp;
        this.slSp = slSp;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSlSp() {
        return slSp;
    }

    public void setSlSp(int slSp) {
        this.slSp = slSp;
    }

}
