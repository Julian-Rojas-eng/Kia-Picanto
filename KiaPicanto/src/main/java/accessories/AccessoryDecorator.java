/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import model.Vehicle;

public abstract class AccessoryDecorator implements Vehicle {
    
    protected Vehicle decoratedVehicle;
    
    public AccessoryDecorator(Vehicle vehicle){
        this.decoratedVehicle = vehicle;
    }
    
    @Override
    public String getDescription(){
        return decoratedVehicle.getDescription();
    }
    
    @Override
    public double getPrice(){
        return decoratedVehicle.getPrice();
    }
}