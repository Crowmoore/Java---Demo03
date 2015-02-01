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
public class Vehicle {
    
    private String model;
    private String color;
    private int speed;
    Driver driver;
    Passenger passenger[];
    Motor motor;
    
    public Vehicle(String name, String color, int speed) {
        this.model = name;
        this.color = color;
        this.speed = speed;
    }

    public String getInfo() {
        return "Model: " + this.model + "\nColor: " + this.color + "\nCurrent speed: " + this.speed + "km/h\n" + motor.getEngineInfo() + driver.getDriverInfo() + "Passengers:\n" + passenger[0].getPassengerInfo() + passenger[1].getPassengerInfo() + passenger[2].getPassengerInfo();
    }
}