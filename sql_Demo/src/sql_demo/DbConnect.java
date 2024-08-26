/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sql_demo;

import java.sql.*;

/**
 *
 * @author Hawin
 */
public class DbConnect {

    static String url = "jdbc:sqlserver://;serverName=localhost;databaseName=Java3";
    static String usename = "hawin";
    static String password = "123456789";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usename, password);
    }

    public static void main(String[] args) throws SQLException {
        getConnection();
    }

}
