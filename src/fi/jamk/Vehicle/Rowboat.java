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
public class Rowboat extends Vehicle{
    
    private int seats;
    private String boatMaterial;

    public Rowboat() {
        this.seats = 0;
        this.boatMaterial = "";
    }

    public Rowboat(String model, String color, int year, double km, int seats, String boatMaterial) {
        super(model, color, year, km);
        this.seats = seats;
        this.boatMaterial = boatMaterial;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setBoatMaterial(String boatMaterial) {
        this.boatMaterial = boatMaterial;
    }
    public String getInfo() {
        return super.getInfo() + "\nSeats: " + this.seats + "\nBoat material: " + this.boatMaterial + "\n";
    }
    
}
