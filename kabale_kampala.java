/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.question3;

/**
 *
 * @author HILARY UGO453
 */
public class kabale_kampala {
    public static void main(String[]args){
        int totalDistance = 10000; 
        int speed = 250;
        int refuelDistance = 200; 
        int stopTime = 5; 
        int stopsForRefueling = totalDistance / refuelDistance;
        int totalStopTime = stopsForRefueling * stopTime; 

        double travelTime = (double) totalDistance / speed; 
        double totalTime = travelTime + (totalStopTime / 60.0); 

        System.out.println("Total time spent on the journey back from Kabale to Kampala: " + totalTime + " hours");
    }
}

        
    

