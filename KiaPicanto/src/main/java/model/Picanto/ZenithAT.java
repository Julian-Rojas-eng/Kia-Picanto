/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Picanto;

import model.Vehicle;

public class ZenithAT implements Vehicle{
    
    @Override
    public String getDescription(){
        return "Kia Picanto Zenith AT";
    }
    
    @Override
    public double getPrice(){
        return 70000000;
    }
}