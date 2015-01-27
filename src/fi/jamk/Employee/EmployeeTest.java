/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Employee;

/**
 *
 * @author h3090
 */
public class EmployeeTest {
    
    public static void main(String args[]) {
        
        Employee employee1 = new Employee("Avian Feelgood", "Doctor", 3200);
        Employee employee2 = new Employee();
        employee2.setName("George Pantazis");
        employee2.setPosition("forklift driver");
        employee2.setSalary(2200);
        Manager manager = new Manager("Big Shot", "Ultimate leader", 6800, "Ferrari", 11000);
        System.out.println(employee1.getInfo());
        System.out.println(employee2.getInfo());
        System.out.println(manager.getInfo());
       
    }
    
}
