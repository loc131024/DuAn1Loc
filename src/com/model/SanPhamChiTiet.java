/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class SanPhamChiTiet {

    private int maCTSP;
    private String maSP;
    private double gia;
    private int soLuong;
    private int maMS;
    private int maSize;
    private int maCL;
    
    private String moTa;
    private String trangThai;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(int maCTSP, String maSP, double gia, int soLuong, int maMS, int maSize, int maCL, String moTa, String trangThai) {
        this.maCTSP = maCTSP;
        this.maSP = maSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.maMS = maMS;
        this.maSize = maSize;
        this.maCL = maCL;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    

    public int getMaCTSP() {
        return maCTSP;
    }

    public void setMaCTSP(int maCTSP) {
        this.maCTSP = maCTSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getMaMS() {
        return maMS;
    }

    public void setMaMS(int maMS) {
        this.maMS = maMS;
    }

    public int getMaSize() {
        return maSize;
    }

    public void setMaSize(int maSize) {
        this.maSize = maSize;
    }

    public int getMaCL() {
        return maCL;
    }

    public void setMaCL(int maCL) {
        this.maCL = maCL;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    


    
}
