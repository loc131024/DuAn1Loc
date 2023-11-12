/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class SanPham {

    private String maSP;
    private String ten;
    private int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String ten, int soLuong) {
        this.maSP = maSP;
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public SanPham(String maSP, String ten) {
        this.maSP = maSP;
        this.ten = ten;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Object[] rowData() {
        return new Object[]{this.maSP, this.ten,this.soLuong};
    }

}
