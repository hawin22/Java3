/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.NhanVien;
import java.sql.*;

/**
 *
 * @author Hawin
 */
public class NhanVienServiceImpl implements NhanVienService{

    ArrayList<NhanVien> list = new ArrayList<>();

    public ArrayList<NhanVien> getAll() {
        list.clear();
            String sql = "select Ma, Ten, Sdt, TrangThai from NhanVien";
        try {
            Connection conn = DbConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMa(rs.getString(1));
                nv.setTen(rs.getString(2));
                nv.setSDT(rs.getString(3));
                nv.setTrangThai(rs.getInt(4));
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public NhanVien getRow(int row){
        return list.get(row);
    }
    public boolean addNV(NhanVien nv){
        String sql = "insert into NhanVien(Ma, Ten, Sdt, TrangThai) values(?,?,?,?)";
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, nv.getMa());
            stm.setString(2, nv.getTen());
            stm.setString(3, nv.getSDT());
            stm.setInt(4, nv.getTrangThai());
            stm.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void update(NhanVien nv){
         String sql = "update NhanVien set Ten = ?, Sdt = ?, TrangThai =? where Ma = ?";
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, nv.getTen());
            stm.setString(2, nv.getSDT());       
            stm.setInt(3, nv.getTrangThai());            
            stm.setString(4, nv.getMa());
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(String ma){
         String sql = "delete NhanVien where Ma = ?";
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);            
            stm.setString(1, ma);
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
