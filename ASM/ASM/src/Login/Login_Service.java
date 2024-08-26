/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import Database.DbConnect;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Login_Service {

    List<Login> list = new ArrayList<>();
    
//    Connection con = null;
//    PreparedStatement ps = null;
//    ResultSet rs = null;
//    String sql = null;

//    public List<Login> getAll() {
//        listLogin = new ArrayList<>();
//        sql = "select Username, Password,Role from taikhoan";
//        try {
//            con = DbConnect.getConnection();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Login lg = new Login(rs.getString(1), rs.getString(2), rs.getString(3));
//                listLogin.add(lg);
//
//            }
//            return listLogin;
//        } catch (Exception e) {
//            return null;
//        }
//    }
    
     public List<Login> getAll() {
        list.clear();
        try {
            String sql = "select Username, Password,Role from taikhoan";
            Connection conn = DbConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                Login l = new Login();
                l.setUserName(rs.getString(1));
                l.setPassWord(rs.getString(2));
                l.setRole(rs.getString(3));
                list.add(l);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
