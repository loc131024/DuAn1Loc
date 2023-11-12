/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banquanao.sevice;

import banquanao.model.sanpham;
import banquanao.model.sanphamchitiet;
import banquanao.untility.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class sanphamchitietService {

    public ArrayList<sanphamchitiet> getallsanphamchitiet() {
        ArrayList<sanphamchitiet> dsspct = new ArrayList<>();

        Connection cn = DB.getConnection();
        String sql = "SELECT sanpham.masp,TENSP,TENSIZE,TENMAU,TENCHATLIEU,gia,chitietsanpham.SOLUONG FROM SANPHAM join CHITIETSANPHAM on sanpham.MASP = CHITIETSANPHAM.masp join MAUSAC on MAUSAC.MAMS = CHITIETSANPHAM.MAMS join CHATLIEU on CHATLIEU.MACL = CHITIETSANPHAM.MACL join SIZE on SIZE.MASIZE = CHITIETSANPHAM.MASIZE\n"
                + "group by sanpham.masp,TENSP,TENSIZE,TENMAU,TENCHATLIEU,gia,chitietsanpham.SOLUONG";
        try {
            PreparedStatement pd = cn.prepareStatement(sql);
            ResultSet rs = pd.executeQuery();
            while (rs.next()) {
                sanphamchitiet spct = new sanphamchitiet();

                spct.setMASP(rs.getString(1));
                spct.setTensp(rs.getString(2));
                spct.setSIZE(rs.getString(3));
                spct.setMau(rs.getString(4));
                spct.setChatlieu(rs.getString(5));
                spct.setGIA(rs.getInt(6));
                spct.setSOLUONG(rs.getInt(7));

                dsspct.add(spct);
            }
        } catch (Exception e) {
            System.out.println("lỗi");
            e.printStackTrace();
        }
        return dsspct;
    }
}
