/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.util.Vector;

/**
 *
 * @author NGUYEN HUU LOC
 */
public class MauSac {
    private int maMau;
    private String tenMau;
    private int soLuong;

    public MauSac() {
    }

    public MauSac(int maMau, String tenMau ) {
        this.maMau = maMau;
        this.tenMau = tenMau;
        
    }

    public MauSac(String tenMau) {
        this.tenMau = tenMau;
        }
    public MauSac(int maMau) {
        this.maMau = maMau;
        }


    public int getMaMau() {
        return maMau;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    

    
    
    public Object[] rowData() {
        return new Object[]{this.maMau,"Màu sắc",this.tenMau};
        }
    
    
}
