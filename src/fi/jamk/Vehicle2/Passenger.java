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
public class Passenger {
    
    private String passengerName;
    private int passengerAge;
    
    public Passenger(String passengerName, int passengerAge) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
    }
    public String getPassengerInfo() {
        return "\n" + this.passengerName + ", " + this.passengerAge;
    }
}