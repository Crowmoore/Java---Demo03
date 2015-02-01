/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.Radio;

/**
 *
 * @author h3090
 */
public class RadioTest {
 
    public static void main(String args[]) {
        
        Radio radio = new Radio();
        radio.setRadioState(true);
        radio.setVolume(9);
        radio.setFrequency(22000);
        //When the values of volume or frequency exceeds the allowed range, the values are discarded and the last permitted values are printed out.
        radio.setVolume(100);
        radio.setFrequency(10);
        System.out.print(radio.getStatus());
        }
        
    }

