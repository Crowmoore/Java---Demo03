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
public class Employee {
    
    private String name;
    private String position;
    private double salary;
    
    public Employee() {
        this.name = "";
        this.position = "";
        this.salary = 0;
    }
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getInfo() {
        return "Name: " + this.name + "\nPosition: " + this.position + "\nSalary: " + this.salary + "$\n";
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
