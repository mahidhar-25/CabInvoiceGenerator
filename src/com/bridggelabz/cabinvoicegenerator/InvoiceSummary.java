
package com.bridggelabz.cabinvoicegenerator;
/*
 * The InvoiceSummary class represents a summary of cab rides, including the total number of rides,
 * the total fare, and the average fare per ride.
 */

public class InvoiceSummary {
    // Number of rides
    private int totalNoRides;

    // Total fare for all rides
    private double totalFare;

    // Average fare per ride
    private double avgFare;

    /*
     * Constructor to initialize the InvoiceSummary with the total number of rides and total fare.
     * It also calculates the average fare.
     * @param totalNoRides - Total number of rides
     * @param totalFare - Total fare for all rides
     * @return : no return
     */
    public InvoiceSummary(int totalNoRides, double totalFare) {
        this.totalNoRides = totalNoRides;
        this.totalFare = totalFare;
        this.avgFare = this.totalFare / this.totalNoRides;
    }
/*
     @desc : Getter method for average fare
     @params : no params
     @return : double

 */
    public double getAvgFare() {
        return avgFare;
    }
    /*
         @desc :Setter method for average fare
         @params : double avgFare
         @return : void

     */
    public void setAvgFare(double avgFare) {
        this.avgFare = avgFare;
    }
    /*
         @desc : Getter method for total number of rides
         @params : no params
         @return : double

     */
    public int getTotalNoRides() {
        return totalNoRides;
    }
    /*
         @desc : Setter method for total number of rides
         @params : int totalNoRides
         @return : void

     */
    public void setTotalNoRides(int totalNoRides) {
        this.totalNoRides = totalNoRides;
    }
    /*
         @desc :Getter method for total fare
         @params : no params
         @return : double

     */
    public double getTotalFare() {
        return totalFare;
    }
    /*
         @desc : Setter method for total fare
         @params : double totalFare
         @return : void

     */
    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    /*
     * @desc : Overrides the equals method to compare two InvoiceSummary objects.
     * @param o - Object to compare
     * @return - True if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvoiceSummary that)) return false;
        return totalNoRides == that.totalNoRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avgFare, avgFare) == 0;
    }


}
