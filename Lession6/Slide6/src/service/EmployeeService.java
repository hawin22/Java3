/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;



import java.util.ArrayList;
import java.util.List;
import model.Employee;
import java.sql.*;
import slide6.DbConnect;
/**
 *
 * @author Hawin
 */
public class EmployeeService {
    List<Employee> list = new ArrayList<>();
    public List<Employee> getAll(){
        list.clear();
        try {
            String sql = "select id, name, email, country from Employee";
            Connection conn = DbConnect.getConennection();
            // get data
           Statement stm = conn.createStatement();
           ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {                
                Integer id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String country = rs.getString(4);
                list.add(new Employee(id, name, email, country));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean add(Employee em){
        try {
            Connection conn = DbConnect.getConennection();
            String sql = "insert into Employee(name, email, country)" +
"values(?,?,?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, em.getName());
            stm.setString(2, em.getEmail());
            stm.setString(3, em.getCountry());
            stm.executeUpdate();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args) {
      
    }
}
