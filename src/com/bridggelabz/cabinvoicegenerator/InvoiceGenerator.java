

package com.bridggelabz.cabinvoicegenerator;

/*
 * @desc : The InvoiceGenerator class handles the generation of invoices for cab rides.
 * It includes methods for calculating fares based on distance and time, as well as generating
 * invoice summaries for individual rides or all rides associated with a user.
 */
public class InvoiceGenerator {

    // Constants for cost calculation
    private final double costPerKilometer;
    private final double costPerMinute;
    private final double minFare;

    /*
     * @desc : Constructor for initializing cost parameters.
     * @param costPerKilometer - Cost per kilometer for the ride
     * @param costPerMinute - Cost per minute for the ride
     * @param minFare - Minimum fare for the ride
     */
    public InvoiceGenerator(double costPerKilometer, double costPerMinute, double minFare) {
        this.costPerKilometer = costPerKilometer;
        this.costPerMinute = costPerMinute;
        this.minFare = minFare;
    }

    /*
     * @desc : Calculate fare for a single ride based on distance and time.
     * @param distance - Distance of the ride in kilometers
     * @param time - Duration of the ride in minutes
     * @return - Total fare for the ride
     */
    public double calculateFare(double distance, double time) {
        double fareByDistance = distance * costPerKilometer;
        double fareByTime = time * costPerMinute;
        double totalFare = fareByTime + fareByDistance;
        if (totalFare < minFare) {
            totalFare = minFare;
        }
        return totalFare;
    }


}
