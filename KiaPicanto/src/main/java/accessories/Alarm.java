/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import model.Vehicle;

public class Alarm extends AccessoryDecorator{
    
    public Alarm(Vehicle vehicle) {
        super(vehicle);
    }
    
    @Override
    public String getDescription(){
        return decoratedVehicle.getDescription() + " + Alarm (2 remotes)";
    }
    
    @Override
    public int getPrice(){
        return decoratedVehicle.getPrice() + 205000;
    }
    
}