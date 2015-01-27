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
public class Motor {
    
    private int horsepower;
    private double engineSize;
    
    public Motor(int horsepower, double engineSize) {
        this.horsepower = horsepower;
        this.engineSize = engineSize;
    }
    public String getEngineInfo() {
        return "Engine size: " + this.engineSize + "\nHorsepower: " + this.horsepower + "\n";
    }
    
}
