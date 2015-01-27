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
public class Bicycle extends Vehicle{
    
    private boolean gears;
    private String gearModel;
    
    public Bicycle() {
        super("", "", 0, 0);
        this.gears = false;
        this.gearModel = "";
    }
    
    public Bicycle(String model, String color, int year, double km, boolean gears, String gearModel) {
        super(model, color, year, km);
        this.gears = gears;
        this.gearModel = gearModel;
    }
    public void setGears(boolean gears) {
        this.gears = gears;
    }
    public void setGearModel(String gearModel) {
        this.gearModel = gearModel;
    }
    public String getInfo() {
        if(this.gears == false) {
            return super.getInfo() + "\nHas gears: " + this.gears + "\n";
        }
        else return super.getInfo() + "\nHas gears: " + this.gears + "\nGear model: " + this.gearModel + "\n";
    }
}
