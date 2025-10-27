/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import model.Vehicle;

public class LuxuryRim extends AccessoryDecorator{
    
    public LuxuryRim(Vehicle vehicle) {
        super(vehicle);
    }
    
    @Override
    public String getDescription(){
        return decoratedVehicle.getDescription() + " + 14'' Black Machined Alloy Rims";
    }
    
    @Override
    public double getPrice(){
        return decoratedVehicle.getPrice() + 500000;
    }
    
}