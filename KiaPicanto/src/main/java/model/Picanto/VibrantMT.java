/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Picanto;

import model.Vehicle;

public class VibrantMT implements Vehicle {
    
    @Override
    public String getDescription(){
        return "Kia Picanto Vibrant Mt";
    }
    
    @Override
    public double getPrice(){
        return 60000000;
    }
}
