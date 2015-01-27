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
public class Manager extends Employee {
    
    private String car;
    private double bonus;
    
    public Manager() {
        super("", "", 0);
        this.car = "";
        this.bonus = 0;
    }
    public Manager(String name, String position, double salary, String car, double bonus) {
        super(name, position, salary);
        this.car = car;
        this.bonus = bonus;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public String getInfo() {
        return super.getInfo() + "Car: " + this.car + "\nBonus: " + this.bonus + "$";
    }
    
}
