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
        
        Vehicle vehicle = new Vehicle("Saab 900", "Brown", 35);
        vehicle.driver = new Driver("Martin", 25);
        vehicle.motor = new Motor(160, 2.5);
        vehicle.passenger = new Passenger[3];
        vehicle.passenger[0] = new Passenger("Claudia", 29);
        vehicle.passenger[1] = new Passenger("Tom", 45);
        vehicle.passenger[2] = new Passenger("Clark", 18);
        System.out.print(vehicle.getInfo());
        
    }
    
}
