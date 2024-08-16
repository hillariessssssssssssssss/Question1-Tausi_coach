/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.question3;

/**
 *
 * @author HILARY UGO453
 */
public class Question3 {

    public static void main(String[] args) {
        int totalDistance = 10000;
        int stopDistance = 150;
        int refuelDistance = 200;

        int stopsForPassengers = totalDistance / stopDistance;
        int stopsForRefueling = totalDistance / refuelDistance;

        int totalStops = stopsForPassengers + stopsForRefueling;
        System.out.println("Total stops from Kampala to Jinja: " + totalStops);
    }
}

    

