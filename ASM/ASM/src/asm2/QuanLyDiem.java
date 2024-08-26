/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;

import asm.Diem;
import asm.QLSV;
import asm.SinhVien;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

/**
 *
 * @author Hawin
 */
public class QuanLyDiem {

    ArrayList<Diem> list = new ArrayList<>();
    QLSinhVien qlsv = new QLSinhVien();

    public ArrayList<Diem> getAll() {
        list.clear();
        try {
            String sql = "select d.masv, s.hoten, d.tienganh, d.tinhoc, d.gdtc from Diem d join SinhVien s on d.masv = s.masv";
            Connection conn = DBConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Diem diem = new Diem();
                diem.setMaSV(rs.getString(1));
                diem.setTenSV(rs.getString(2));
                diem.setDiemTA(rs.getDouble(3));
                diem.setDiemTH(rs.getDouble(4));
                diem.setDiemGDTC(rs.getDouble(5));
                list.add(diem);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Diem getRow(int row) {
        return list.get(row);
    }

    public boolean addDiem(Diem sv) {
        List<SinhVien> sv1 = qlsv.getAll();
        int dem = 0;
        for (SinhVien sinhVien : sv1) {
            if (sinhVien.getMa().equals(sv.getMaSV())) {
                dem++;
                Diem diem = new Diem(sv.getMaSV(), sv.getTenSV(), Double.NaN, Double.NaN, Double.NaN);
            }
        }
        if (dem > 0) {

        }
        String sql = "insert into Diem(masv, tienganh, tinhoc, gdtc) values(?,?,?,?)";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, sv.getMaSV());
            stm.setDouble(2, sv.getDiemTA());
            stm.setDouble(3, sv.getDiemTH());
            stm.setDouble(4, sv.getDiemGDTC());
            stm.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void deleteDiem(String maSV) {
        String sql = "delete from Diem where masv = ?";
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

    public void updateDiem(Diem diem) {
        String sql = "update Diem set tienganh = ?, tinhoc = ?, gdtc = ? where masv = ? ";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setDouble(1, diem.getDiemTA());
            stm.setDouble(2, diem.getDiemTH());
            stm.setDouble(3, diem.getDiemGDTC());
            stm.setString(4, diem.getMaSV());
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Diem> search(String keyWord) {
        String sql = "select d.masv, s.hoten,tienganh,tinhoc,gdtc from Diem d join SinhVien s on d.masv = s.masv where s.masv like ?";
        list.clear();
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, "%" + keyWord + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Diem diem = new Diem();
//                SinhVien sv = new SinhVien();
//                sv.setMa(keyWord);
                diem.setMaSV(rs.getString(1));
                diem.setTenSV(rs.getString(2));
                diem.setDiemTA(rs.getDouble(3));
                diem.setDiemTH(rs.getDouble(4));
                diem.setDiemGDTC(rs.getDouble(5));
                list.add(diem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Diem> sortByName() {
        list.clear();
        try {
            String sql = "select d.masv, s.hoten,tienganh,tinhoc,gdtc from diem d join SinhVien s ON d.masv=s.masv ORDER BY s.hoten";
            Connection conn = DBConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Diem d = new Diem();
                d.setMaSV(rs.getString(1));
                d.setTenSV(rs.getString(2));
                d.setDiemTA(rs.getDouble(3));
                d.setDiemTH(rs.getDouble(4));
                d.setDiemGDTC(rs.getDouble(5));
                
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Diem> sortByDiemTb() {
        list.clear();
        try {
            String sql = "select d.masv, s.hoten,tienganh,tinhoc,gdtc from diem d join SinhVien s ON d.masv=s.masv ORDER BY (d.gdtc+d.tienganh+d.tinhoc) desc";
            Connection conn = DBConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Diem d = new Diem();
                d.setMaSV(rs.getString(1));
                d.setTenSV(rs.getString(2));
                d.setDiemTA(rs.getDouble(3));
                d.setDiemTH(rs.getDouble(4));
                d.setDiemGDTC(rs.getDouble(5));
                
                list.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
//    ArrayList<SinhVien> listDiem = new ArrayList<>();
//
//    ArrayList<SinhVien> getDiem(){
//        return listDiem;
//    }
//    SinhVien timKiemTheoMa(String ma){
//         for (SinhVien dsv : listDiem) {
//             if (dsv.getMa().equals(ma)) {
//                 return dsv;
//             }
//         }
//         return null;
//    }

}
