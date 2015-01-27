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
public class VehicleTest {
    
    public static void main(String args[]) {
        
        Vehicle vehicle = new Vehicle();
        vehicle.driver = new Driver("Martin", 25);
        vehicle.motor = new Motor(160, 2.5);
        vehicle.passenger = new Passenger("Claudia", 29);
        System.out.print(vehicle.getInfo());
        
    }
    
}
