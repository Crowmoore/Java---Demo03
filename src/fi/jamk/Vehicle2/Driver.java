/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.Vehicle2;

/**
 *
 * @author h3090
 */
public class Driver {
    
    private String name;
    private int age;
    
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getDriverInfo() {
        return "Driver name: " + this.name + "\nDriver age: " + this.age;
    }
    
}
