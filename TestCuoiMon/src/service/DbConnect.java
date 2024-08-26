package service;

import java.sql.*;

public class DbConnect {
    static String url = "jdbc:sqlserver://;serverName=localhost;databaseName=PTPM_FINALLY_JAVA_SOF203;encrypt=true;trustServerCertificate=true";    
    static String username = "sa";
    static String password = "123456789";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }
    
    public static void main(String[] args) throws SQLException {
        getConnection();
    }
}
