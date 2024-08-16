/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.question3;

/**
 *
 * @author HILARY UGO453
 */
public class kampala_to_kabale {
        
        public static void main(String[] args) {
        int totalDistance = 10000; 
        int speed = 250; 
        int stopDistance = 150;
        int refuelDistance = 200;
        int stopTime = 5;

        int stopsForPassengers = totalDistance / stopDistance;
        int stopsForRefueling = totalDistance / refuelDistance;

        int totalStops = stopsForPassengers + stopsForRefueling;
        int totalStopTime = totalStops * stopTime; 

        double travelTime = (double) totalDistance / speed; 
        double totalTime = travelTime + (totalStopTime / 60.0);

        System.out.println("Total time taken to travel from Kampala to Kabale: " + totalTime + " hours");
    }
}

