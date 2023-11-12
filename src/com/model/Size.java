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
public class Size {
    private int maSize;
    private String giaTri;
    

    public Size() {
    }

    public Size(int maSize, String giaTri) {
        this.maSize = maSize;
        this.giaTri = giaTri;
    }

    public Size(String giaTri) {
        this.giaTri = giaTri;
        }
    public Size(int maSize) {
        this.maSize = maSize;
        }

    public int getMaSize() {
        return maSize;
    }

    public void setMaSize(int maSize) {
        this.maSize = maSize;
    }

    public String getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(String giaTri) {
        this.giaTri = giaTri;
    }

    
    public Object[] rowData() {
        return new Object[]{this.maSize,"Size",this.giaTri};
          }
    
    
}
