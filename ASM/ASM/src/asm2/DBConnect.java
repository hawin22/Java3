/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2;
import java.sql.*;
/**
 *
 * @author Hawin
 */
public class DBConnect {
    static String url = "jdbc:sqlserver://;serverName=localhost;databaseName=asm; encrypt=true;trustServerCertificate=true";
    static String username = "sa";
    static String password = "123456789";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }
    public static void main(String[] args) throws SQLException {
        getConnection();
    }
}
