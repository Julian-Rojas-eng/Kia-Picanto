/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessories;

import model.Vehicle;

public class ParkingSensor extends AccessoryDecorator{
    
    public ParkingSensor(Vehicle vehicle) {
        super(vehicle);
    }
    
    @Override
    public String getDescription(){
        return decoratedVehicle.getDescription() + " + Parking Sensor";
    }
    
    @Override
    public int getPrice(){
        return decoratedVehicle.getPrice() + 150000;
    }
    
}