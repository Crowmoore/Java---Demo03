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
    Passenger passenger;
    Motor motor;
    
    public Vehicle() {
        this.model = "Saab 900";
        this.color = "Brown";
        this.speed = 35;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setPassengers(Passenger passenger) {
        this.passenger = passenger;
    }
    public String getInfo() {
        return "Model: " + this.model + "\nColor: " + this.color + "\nCurrent speed: " + this.speed + "km/h\n" + motor.getEngineInfo() + driver.getDriverInfo() + "\nPassengers:" + this.passenger;
    }
}