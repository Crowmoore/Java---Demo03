/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.Radio;

/**
 *
 * @author Greatmelons
 */
public class Radio {
    
    private boolean isOn;
    private int volume;
    private double frequency;

    public Radio() {
        this.isOn = false;
        this.volume = 0;
        this.frequency = 0;
    }
    
    public Radio(boolean isOn, int volume, double frequency) {
        this.isOn = isOn;
        this.volume = volume;
        this.frequency = frequency;
    }
    public void setRadioState(boolean isOn) {
        this.isOn = isOn;
    }
    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 9)    {
            this.volume = volume;
        }
    }
    public void setFrequency(double frequency) {
        if(frequency >= 2000 && frequency <= 26000) {
            this.frequency = frequency;
        }
    }
    
    public int getVolume() {
        return this.volume;
    }
    public double getFrequency() {
        return this.frequency;
    }
    public boolean getRadioState() {
        return this.isOn;
    }
    public String getStatus() {
        if(this.isOn == false) {
            return "The radio is off";
        }
        else {
            return "The radio is on and the volume is at " + this.volume + " and the frequenzy is at " + this.frequency;
        }
    }
    
    
    
}
