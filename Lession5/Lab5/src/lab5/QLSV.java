/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hawin
 */
public class QLSV {

    List<SinhVien> list = new ArrayList<>();

    public List<SinhVien> getAll() {
        list.clear();
        try {
            String sql = "SELECT MaSV,HoTen,Email,SoDT,DiaChi,GioiTinh FROM Students";
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
                sv.setGioiTinh((rs.getBoolean(6)));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public SinhVien getRow(int row) {
        return list.get(row);
    }

    public boolean addSV(SinhVien sv) {
        String sql = "insert into Students(MaSV, Hoten, Email, SoDT, Diachi, Gioitinh)"
                + " values(?,?,?,?,?,?)";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, sv.getMa());
            stm.setString(2, sv.getHoTen());
            stm.setString(3, sv.getEmail());
            stm.setString(4, sv.getSDT());
            stm.setString(5, sv.getDiaChi());
            stm.setBoolean(6, sv.getGioiTinh());
            stm.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void deleteSV(String maSV) {
        String sql = "delete from Students where MaSV = ?";
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

    public void updateSV(SinhVien sv) {
        String sql = "update Students set Hoten = ?, Gioitinh =? where MaSV = ? ";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, sv.getHoTen());
            stm.setBoolean(2, sv.getGioiTinh());
            stm.setString(3, sv.getMa());
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public List<SinhVien> search(String keyWord) {
        String sql = "select * from Students where Hoten like ? or MaSV like ?";
        list.clear();
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, "%" + keyWord + "%");
            stm.setString(2, "%" + keyWord + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
                sv.setMa(rs.getString(1));
                sv.setHoTen(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setSDT(rs.getString(4));
                sv.setDiaChi(rs.getString(5));
                sv.setGioiTinh(rs.getBoolean(6));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        //Thêm dữ liệu
//        sv.setMa("PH111");
//        sv.setHoTen("Hawin");
//        sv.setGioiTinh(false);
        QLSV qlsv = new QLSV();
//        qlsv.addSV(sv);
        // Xóa dữ liệu
//        qlsv.deleteSV("PH111");
        sv.setHoTen("thu");
        sv.setGioiTinh(false);
        sv.setMa("PH02");
        qlsv.updateSV(sv);
    }

    
}
