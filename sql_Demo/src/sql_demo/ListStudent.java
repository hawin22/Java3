/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql_demo;
import java.sql.*;
/**
 *
 * @author Hawin
 */
public class ListStudent {
    public static void main(String[] args) throws SQLException {
        Connection conn = DbConnect.getConnection();
        String sql = "select MaSV, Hoten from Students";
       Statement stm = conn.createStatement();
       ResultSet rs = stm.executeQuery(sql);
       while(rs.next()){
           String maSV = rs.getString(1); //1: vị trí của biến trong bảng sql
           String hoTen = rs.getString("HoTen"); // Hoặc là gọi thẳng luôn tên biến
           System.out.println(maSV + ", " + hoTen );
       }
    }
}
