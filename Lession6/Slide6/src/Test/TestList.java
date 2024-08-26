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
public class TestList {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        for (Employee em : service.getAll()) {
            System.out.println(em.getId() + ", " + em.getName());
        }
    }
}
