/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;

import asm.SinhVien;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author Hawin
 */
public class QLSinhVien {
    ArrayList<SinhVien> list = new ArrayList<>();
    public ArrayList<SinhVien> getAll(){
        list.clear();
        try {
            String sql = "select masv, hoten, email, sodt, diachi, gioitinh, Hinh from SinhVien";
            Connection conn = DBConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getString(1));
                sv.setHoTen(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setSDT(rs.getString(4));
                sv.setDiaChi(rs.getString(5));
                sv.setGioiTinh(rs.getBoolean(6));
                sv.setLinkAnh(rs.getString(7));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public SinhVien getRow(int row){
        return list.get(row);
    }
    public boolean addSV(SinhVien sv){
        String sql = "insert into SinhVien(masv, hoten, email, sodt, diachi, gioitinh, Hinh)"
                + "values(?,?,?,?,?,?,?)";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, sv.getMa());
            stm.setString(2, sv.getHoTen());
            stm.setString(3, sv.getEmail());
            stm.setString(4, sv.getSDT());
            stm.setString(5, sv.getDiaChi());
            stm.setBoolean(6, sv.getGioiTinh());
            stm.setString(7, sv.getLinkAnh());
            stm.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void deleteSV(String maSV){
        String sql = "delete from SinhVien where masv = ?";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, maSV);
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateSV(SinhVien sv){
        String sql = "UPDATE SinhVien set hoten = ?, email = ?, sodt = ?, diachi = ?, gioitinh = ?, Hinh = ? where masv = ?";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, sv.getHoTen());
            stm.setString(2, sv.getEmail());
            stm.setString(3, sv.getSDT());
            stm.setString(4, sv.getDiaChi());
            stm.setBoolean(5, sv.getGioiTinh());
            stm.setString(6, sv.getLinkAnh());
            stm.setString(7, sv.getMa());
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
