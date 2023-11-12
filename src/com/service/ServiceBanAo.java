/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

/**
 *
 * @author NGUYEN HUU LOC
 */
import com.model.ChatLieu;
import com.model.MauSac;
import com.model.SanPham;
import com.model.SanPhamChiTiet;
import com.model.Size;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceBanAo {
    
    

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    
   public List<SanPhamChiTiet> getSPCT(){
       List<SanPhamChiTiet> list = new ArrayList();
       sql="select MASP,MAMS,MACL,MASIZE,SOLUONG,GIA,TRANGTHAI from CHITIETSANPHAM";
       try {
           con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPhamChiTiet spct = new SanPhamChiTiet();
                spct.setMaSP(rs.getString("MASP"));
                spct.setMaMS(rs.getInt("MAMS"));
                spct.setMaCL(rs.getInt("MACL"));
                spct.setMaSize(rs.getInt("MASIZE"));
                spct.setSoLuong(rs.getInt("SOLUONG"));
                spct.setGia(rs.getDouble("GIA"));
                spct.setTrangThai(rs.getString("TRANGTHAI"));
                list.add(spct);
            }
            return list;
       } catch (Exception e) {
           return null;
       }
 
           
   }
   public SanPhamChiTiet getSPCTByMaSP(String maSP){
       SanPhamChiTiet spct = null;
       sql="select MASP,MAMS,MACL,MASIZE,SOLUONG,GIA,TRANGTHAI from CHITIETSANPHAM where MASP=?";
       try {
           con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maSP);
            rs = ps.executeQuery();
            while(rs.next()){
                 spct = new SanPhamChiTiet();
                spct.setMaSP(rs.getString("MASP"));
                spct.setMaMS(rs.getInt("MAMS"));
                spct.setMaCL(rs.getInt("MACL"));
                spct.setMaSize(rs.getInt("MASIZE"));
                spct.setSoLuong(rs.getInt("SOLUONG"));
                spct.setGia(rs.getDouble("GIA"));
                spct.setTrangThai(rs.getString("TRANGTHAI"));
                
            }
            return spct;
       } catch (Exception e) {
           return null;
       }
 
           
   }
    public List<SanPham> getSP() {
        List<SanPham> list = new ArrayList();
        sql = "select MASP,TENSP,SOLUONG from SANPHAM";
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getString("MASP"));
                sp.setTen(rs.getString("TENSP"));
                sp.setSoLuong(rs.getInt("SOLUONG"));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public List<MauSac> getMauSac() {
        List<MauSac> list = new ArrayList();
        sql = "select TENMAU from MAUSAC";
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1));
                list.add(ms);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Size> getSize() {
        List<Size> list = new ArrayList();
        sql = "select TENSIZE from SIZE";
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Size size = new Size(rs.getString(1));
                list.add(size);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public List<ChatLieu> getChatLieu() {
        List<ChatLieu> list = new ArrayList();
        sql = "select TENCHATLIEU FROM CHATLIEU";
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChatLieu cl = new ChatLieu(rs.getString(1));
                list.add(cl);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public String getTenSP(String ma) {
        sql = "select TENSP from SANPHAM where MASP=?";
        MauSac ms = null;
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                ms = new MauSac(rs.getString(1));
            }
            return ms.getTenMau();
        } catch (Exception e) {
            return null;
        }
    }
    public String getTenMau(String ma) {
        sql = "select TENMAU from MAUSAC where MAMS=?";
        MauSac ms = null;
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                ms = new MauSac(rs.getString(1));
            }
            return ms.getTenMau();
        } catch (Exception e) {
            return null;
        }
    }

    public String getTenSize(String ma) {
        sql = "select TENSIZE from SIZE where MASIZE=?";
        Size size = null;
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                size = new Size(rs.getString(1));
            }
            return size.getGiaTri();
        } catch (Exception e) {
            return null;
        }
    }

    public String getTenCL(String ma) {
        sql = "select TENCHATLIEU from CHATLIEU where MACL=?";
        ChatLieu cl = null;
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                cl = new ChatLieu(ma);
            }
            return cl.getTenCL();
        } catch (Exception e) {
            return null;
        }
    }
    public int getMaMau(String ten) {
        sql = "select MAMS from MauSac where TENMAU=?";
        MauSac ms = null;
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ten);
            rs = ps.executeQuery();
            while (rs.next()) {
                ms = new MauSac(rs.getInt(1));
            }
            return ms.getMaMau();
        } catch (Exception e) {
            return 0;
        }
    }

    public int getMaSize(String ten) {
        sql = "select MASIZE from Size where TENSIZE=?";
        Size size = null;
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ten);
            rs = ps.executeQuery();
            while (rs.next()) {
                size = new Size(rs.getInt(1));
            }
            return size.getMaSize();
        } catch (Exception e) {
            return 0;
        }
    }
    public int getMaCL(String ten) {
        sql = "select MACL from CHATLIEU where TENCHATLIEU=?";
        ChatLieu cl = null;
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ten);
            rs = ps.executeQuery();
            while (rs.next()) {
                cl = new ChatLieu(rs.getInt(1));
            }
            return cl.getMaCL();
        } catch (Exception e) {
            return 0;
        }
    }

    

    public int addSanPham(SanPham sp) {

        sql = "insert into SANPHAM values ('SP'+CAST((select COUNT(*) from SANPHAM)+1 as varchar(10)),?,?)";
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setObject(1, sp.getTen());
            ps.setObject(2, sp.getSoLuong());

            return ps.executeUpdate();
        } catch (Exception e) {
            return 0;
        }
    }
    public int addSanPhamCT(SanPhamChiTiet spct) {

        sql = "insert into CHITIETSANPHAM values (?,?,?,?,null,?,?,?,?)";
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, spct.getMaSP());
            ps.setObject(2, spct.getMaMS());
            ps.setObject(3, spct.getMaCL());
            ps.setObject(4, spct.getMaSize());
            ps.setObject(5, spct.getSoLuong());
            ps.setObject(6, spct.getGia());
            ps.setObject(7, spct.getMoTa());
            ps.setObject(8, spct.getTrangThai());
            

            return ps.executeUpdate();
        } catch (Exception e) {
            return 0;
        }
    }
    public int updSanPham(SanPham sp,String ma) {

        sql = "update SANPHAM set TENSP=?,SOLUONG=? where MASP=?";
        try {
            con = DBConnect111.getConnection();
            ps = con.prepareStatement(sql);
            
            ps.setObject(1, sp.getTen());
            ps.setObject(2, sp.getSoLuong());
            ps.setObject(3, ma);

            return ps.executeUpdate();
        } catch (Exception e) {
            return 0;
        }
    }

}
