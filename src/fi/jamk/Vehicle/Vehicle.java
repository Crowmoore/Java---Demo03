/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.Vehicle;

/**
 *
 * @author h3090
 */
public class Vehicle {
    
    private String model;
    private String color;
    private int year;
    private double km;
    
    public Vehicle() {
        this.model = "";
        this.color = "";
        this.year = 0;
        this.km = 0;
    }
    public Vehicle(String model, String color, int year, double km) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.km = km;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setkm(double km) {
        this.km = km;
    }
    public String getInfo() {
        return "Model: " + this.model + "\nColor: " + this.color + "\nManufacture year: " + this.year + "\nKilometers driven: " + this.km;
    }
}
