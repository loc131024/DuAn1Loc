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
public class ChatLieu {

    private int maCL;
    private String tenCL;

    public ChatLieu() {
    }

    public ChatLieu(int maCL, String tenCL) {
        this.maCL = maCL;
        this.tenCL = tenCL;

    }
    public ChatLieu(int maCL) {
        this.maCL = maCL;

    }



    public ChatLieu(String tenCL) {
        this.tenCL = tenCL;
    }

    public int getMaCL() {
        return maCL;
    }

    public void setMaCL(int maCL) {
        this.maCL = maCL;
    }

    public String getTenCL() {
        return tenCL;
    }

    public void setTenCL(String tenCL) {
        this.tenCL = tenCL;
    }

    public Object[] rowData() {
        return new Object[]{this.maCL, "Chất liệu", this.tenCL};
    }

}
