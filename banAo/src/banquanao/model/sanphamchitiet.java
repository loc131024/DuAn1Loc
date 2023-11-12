/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banquanao.model;

/**
 *
 * @author HP
 */
public class sanphamchitiet {
    private int SOLUONG;
    private  String MASP,SIZE,TRANGTHAI,tensp,mau,chatlieu;
    private double GIA;

    public sanphamchitiet() {
    }

    public sanphamchitiet(int SOLUONG, String MASP, String SIZE, String TRANGTHAI, String tensp, String mau, String chatlieu, double GIA) {
        this.SOLUONG = SOLUONG;
        this.MASP = MASP;
        this.SIZE = SIZE;
        this.TRANGTHAI = TRANGTHAI;
        this.tensp = tensp;
        this.mau = mau;
        this.chatlieu = chatlieu;
        this.GIA = GIA;
    }

    
    
    
    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public String getMASP() {
        return MASP;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public String getSIZE() {
        return SIZE;
    }

    public void setSIZE(String SIZE) {
        this.SIZE = SIZE;
    }

    public String getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(String TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public double getGIA() {
        return GIA;
    }

    public void setGIA(double GIA) {
        this.GIA = GIA;
    }

    
    
}
