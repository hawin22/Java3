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
import model.XeMay;

/**
 *
 * @author Hawin
 */
public class XeMayServiceImpl implements Service {
     ArrayList<XeMay> list = new ArrayList<>();
    public ArrayList<XeMay> getAll(){
        list.clear();
        String sql = "select Ma, Ten, GiaNhap, TrangThai from XeMay";
        try {
            Connection conn = DbConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                XeMay xm = new XeMay();
                xm.setMa(rs.getString(1));
                xm.setTen(rs.getString(2));
                xm.setGiaNhap(rs.getDouble(3));
                xm.setTrangThai(rs.getInt(4));
                list.add(xm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public XeMay getRow(int row){
        return list.get(row); 
    }
    public boolean add(XeMay xm){
        String sql = "insert into XeMay(Ma, Ten, GiaNhap, TrangThai) values (?, ?, ?, ?)";
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, xm.getMa());
            stm.setString(2, xm.getTen());
            stm.setDouble(3, xm.getGiaNhap());
            stm.setInt(4, xm.getTrangThai());
            stm.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void Update(XeMay xm){
        String sql = "update XeMay set Ten = ?, GiaNhap = ?, TrangThai = ? where ma = ?";
        try {
            Connection conn = DbConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, xm.getTen());
            stm.setDouble(2, xm.getGiaNhap());
            stm.setInt(3, xm.getTrangThai());
            stm.setString(4, xm.getMa());
            stm.executeUpdate();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
