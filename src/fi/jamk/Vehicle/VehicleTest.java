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
public class VehicleTest {
    
    public static void main(String args[]) {
        
        Bicycle bicycle1 = new Bicycle();
        bicycle1.setModel("Citybike");
        bicycle1.setColor("Red");
        bicycle1.setYear(2012);
        bicycle1.setkm(486);
        bicycle1.setGears(true);
        bicycle1.setGearModel("Ultimagear");
        Bicycle bicycle2 = new Bicycle("Childs bike", "Pink", 2008, 32, false, "Invisiblegear");
        
        Rowboat rowboat1 = new Rowboat();
        rowboat1.setModel("Rower 2000");
        rowboat1.setColor("White");
        rowboat1.setYear(1998);
        rowboat1.setkm(201);
        rowboat1.setSeats(6);
        rowboat1.setBoatMaterial("Wood");
        Rowboat rowboat2 = new Rowboat("Sunken King", "Black", 1992, 13, 4, "Rot");
        
        System.out.println(bicycle1.getInfo());
        System.out.println(bicycle2.getInfo());
        System.out.println(rowboat1.getInfo());
        System.out.println(rowboat2.getInfo());
    }
    
}
