/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banquanao.sevice;

import banquanao.model.dangnhap;
import banquanao.model.sanpham;
import banquanao.untility.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class sanphamservice {
    public ArrayList<sanpham> getallsanpham(){
        ArrayList<sanpham> dssp = new ArrayList<>();
       
        Connection cn = DB.getConnection();
        String sql = "SELECT * FROM SANPHAM";
        try {
           PreparedStatement pd = cn.prepareStatement(sql);
           ResultSet rs = pd.executeQuery();
            while (rs.next()) {       
              sanpham sp = new sanpham();   
                sp.setMasp(rs.getString(1));
                sp.setTensp(rs.getString(2));
                sp.setSlSp(rs.getInt(3));
                dssp.add(sp);
            }
        } catch (Exception e) {
            System.out.println("lỗi");
            e.printStackTrace();
        }
        return dssp;
    }
    
    public Integer addSanPham(sanpham sp){
        Integer row =null;
        Connection cn = DB.getConnection();
        String sql = "INSERT INTO SANPHAM (MASP,TENSP,SOLUONG) VALUES(?,?,?)";
        try {
           PreparedStatement pd = cn.prepareStatement(sql);
           pd.setString(1, sp.getMasp());
           pd.setString(2, sp.getTensp());
           pd.setInt(3, sp.getSlSp());
           row = pd.executeUpdate();
        } catch (Exception e) {
            System.out.println("lỗi");
            e.printStackTrace();
        }
        return row;
    }
    
     public Integer UpdateSanPham(sanpham sp){
        Integer row =null;
        Connection cn = DB.getConnection();
        String sql = "update sanpham\n" +
"set TENSP = ?,SOLUONG = ?\n" +
"where Masp = ?";
        try {
           PreparedStatement pd = cn.prepareStatement(sql);
           pd.setString(1, sp.getTensp());
           pd.setInt(2, sp.getSlSp());
           pd.setString(3, sp.getMasp());
           
           row = pd.executeUpdate();
        } catch (Exception e) {
            System.out.println("lỗi");
            e.printStackTrace();
        }
        return row;
    }
}
