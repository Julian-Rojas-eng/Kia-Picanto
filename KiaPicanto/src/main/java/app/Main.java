/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import model.Vehicle;
import model.Picanto.*;
import accessories.*;

public class Main {
    public static void main(String[] args){
        
        System.out.println("=== Kia Picanto Dealer System ===");
        
        //VibrantMT with no accessories
        Vehicle vibrantMT = new VibrantMT();
        System.out.println("Model: " + vibrantMT.getDescription());
        System.out.println("Price: $" + vibrantMT.getPrice());
        
        System.out.println("------------------------------------------");
        
        //ZenithMT with alarm
        Vehicle zenithMT = new ZenithMT();
        zenithMT = new Alarm(zenithMT);
        System.out.println("Model: " + zenithMT.getDescription());
        System.out.println("Price: $" + zenithMT.getPrice());
        
        System.out.println("------------------------------------------");
        
        //ZenithAT with alarm + parking sensor
        Vehicle zenithAT = new ZenithAT();
        zenithAT = new Alarm(zenithAT);
        zenithAT = new ParkingSensor(zenithAT);
        System.out.println("Model: " + zenithAT.getDescription());
        System.out.println("Price: $" + zenithAT.getPrice());
        
        System.out.println("------------------------------------------");
        
        //GT Line AT with luxury rims + alarm + parking sensor
        Vehicle gtLineAT = new GTLineAT();
        gtLineAT = new LuxuryRim(gtLineAT);
        gtLineAT = new Alarm(gtLineAT);
        gtLineAT = new ParkingSensor(gtLineAT);
        System.out.println("Model: " + zenithAT.getDescription());
        System.out.println("Price: $" + zenithAT.getPrice());
        
        System.out.println("------------------------------------------");
        
        System.out.println("End of the vehicle catalog");
    }
}