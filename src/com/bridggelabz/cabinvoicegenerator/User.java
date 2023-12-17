/*
 * The User class represents a user in the system with a unique user ID and a list of rides associated with the user.
 */

package com.bridggelabz.cabinvoicegenerator;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String userId;
    ArrayList<Ride> rides;

    /*
     * @desc : Default constructor to create a User object with no initial values.
     */
    public User() {
    }

    /*
     * @desc : Parameterized constructor to initialize a User object with the provided user ID and a list of rides.
     * @param userId - Unique identifier for the user
     * @param rides - List of rides associated with the user
     * @return : void
     */
    public User(String userId, ArrayList<Ride> rides) {
        this.userId = userId;
        this.rides = rides;
    }

    /*
     * @desc : Getter method to retrieve the user ID.
     * @params : no params
     * @return - User ID of the user
     */
    public String getUserId() {
        return userId;
    }

    /*
     * @desc : Setter method to set the user ID.
     * @param userId - User ID to set for the user
     * @return : void
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /*
     * @desc : Getter method to retrieve the list of rides associated with the user.
     * @params : no params
     * @return - List of rides associated with the user
     */
    public ArrayList<Ride> getRides() {
        return rides;
    }

    /*
     * @desc : Setter method to set the list of rides associated with the user.
     * @param rides - List of rides to set for the user
     * @return : void
     */
    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }

    /*
     * @desc : Overridden equals method to compare two User objects based on their user ID and list of rides.
     * @param o - Object to compare
     * @return - true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(rides, user.rides);
    }
}
