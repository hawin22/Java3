/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ktra.DbConnect;
import model.Sach;

/**
 *
 * @author Hawin
 */
public class SachService {

    List<Sach> list = new ArrayList<>();

    public List<Sach> getAll() {
        list.clear();
        try {
            String sql = "select ma,ten, DonGia, TrangThai from Sach";
            Connection conn = DbConnect.getConennection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Sach s = new Sach();
                s.setMa(rs.getString(1));
                s.setTen(rs.getString(2));
                s.setDonGia(rs.getDouble(3));
                s.setTrangThai(rs.getInt(4));

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
     public Sach getRow(int row) {
        return list.get(row);
    }
 public void delete(String ma) {
        String sql = "delete from Sach where Ma = ?";
        try {
            Connection conn = DbConnect.getConennection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, ma);
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSV(Sach s) {
        String sql = "update Sach set ten = ?, DonGia = ?, TrangThai = ? where ma = ? ";
        try {
            Connection conn = DbConnect.getConennection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, s.getTen());
            stm.setDouble(2, s.getDonGia());
            stm.setInt(3, s.getTrangThai());
            stm.setString(4, s.getMa());
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SachService service = new SachService();
        Sach s = new Sach();
    }
}
