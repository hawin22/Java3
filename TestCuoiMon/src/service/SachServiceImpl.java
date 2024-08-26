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
import model.Sach;

/**
 *
 * @author Hawin
 */
public class SachServiceImpl implements SachService {
      ArrayList<Sach> list = new ArrayList<>();
    public ArrayList<Sach> getAll(){
        String sql = "select Ma, Ten, DonGia, TrangThai from Sach";
        try {
            list.clear();
            Connection conn = DbConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                Sach s = new Sach();
                s.setMa(rs.getString(1));
                s.setTen(rs.getString(2));
                s.setGia(rs.getDouble(3));
                s.setTrangThai(rs.getInt(4));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public Sach getRow(int row){
        return list.get(row);
    }
    public void update(Sach s){
        String sql = "update Sach set Ten = ?, DonGia = ?, TrangThai = ? where Ma = ?";
        try {
            
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, s.getTen());
            stm.setDouble(2, s.getGia());
            stm.setInt(3, s.getTrangThai());
            stm.setString(4, s.getMa());
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    public void delete(String maS){
        String sql = "delete Sach where ma = ?";
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, maS);
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
