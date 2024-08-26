/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql_demo;

/**
 *
 * @author Hawin
 */
import java.sql.*;

public class CreateStudent {

    public static void main(String[] args) throws SQLException {
        String maSV = "PH06";
        String hoTen = "Nguyễn Hữu Nghĩa";
        String email = "nghianhph46340";
        String sdt = "0123456789";
        String diaChi = "HN";
        boolean gioiTinh = true;
        String sql = "insert into Students(MaSV, Hoten, Email, SoDT, Diachi, Gioitinh)"
                + " values(?,?,?,?,?,?)";
//                + "('PH02', N'Hoàng Thọ Chính', 'chinhhtph46334', '0123456249', 'HN', 0),"
//                + "('PH03', N'Vũ Tuấn Huy', 'huyvtph46307', '0546456789', 'HN', 0)";
        Connection conn = DbConnect.getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
//        Statement stm = conn.createStatement();
//Set tham số(params)
        stm.setString(1, maSV);
        stm.setString(2, hoTen);
        stm.setString(3, email);
        stm.setString(4, sdt);
        stm.setString(5, diaChi);
        stm.setBoolean(6, gioiTinh);
        stm.executeUpdate();
    }
}
