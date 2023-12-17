
package com.bridggelabz.cabinvoicegenerator;
/*
 * The Ride class represents a single ride with distance and time information.
 */

public class Ride {
    private double distance;
    private double time;


    /*
     * Constructor to initialize a Ride object with the provided distance and time.
     * @param distance - Distance covered in the ride
     * @param time - Duration of the ride
     */
    public Ride(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    /*
     * Getter method to retrieve the distance of the ride.
     * @return - Distance covered in the ride
     */
    public double getDistance() {
        return distance;
    }

    /*
     * Setter method to set the distance of the ride.
     * @param distance - Distance to set for the ride
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /*
     * Getter method to retrieve the duration of the ride.
     * @return - Duration of the ride
     */
    public double getTime() {
        return time;
    }

    /*
     * Setter method to set the duration of the ride.
     * @param time - Duration to set for the ride
     */
    public void setTime(double time) {
        this.time = time;
    }
}
