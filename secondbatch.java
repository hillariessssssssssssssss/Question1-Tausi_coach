/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.question3;

/**
 *
 * @author HILARY UGO453
 */
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class secondbatch{
    public static void main(String[] args) {
        int totalDistance = 10000; 
        double speed = 225.5;

        double speedKmHr = speed * 3.6;
        double travelTime = totalDistance / speedKmHr;

        LocalTime startTime = LocalTime.of(9, 0); 
        LocalTime arrivalTime = startTime.plus((long) (travelTime * 60), ChronoUnit.MINUTES);

        System.out.println("Approximate arrival time in Kampala: " + arrivalTime);
    }
}


