/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import model.Employee;
import service.EmployeeService;

/**
 *
 * @author Hawin
 */
public class TestCreate {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Employee em = new Employee(null, "A1", "A1@gmail.com", "Hà Nội");
        service.add(em);
    }
}
