package com.bridggelabz.cabinvoicegenerator;

import java.util.ArrayList;

/*
@desc : CabOrganization class handles all the users and their rides and provides invoices
 */
public class CabOrganization {
    // @desc: List of users in the organization
    public static ArrayList<User> usersList = new ArrayList<>();
/*
     @desc: Getter method for usersList
     @return: ArrayList<User> - List of users in the organization
     */

    public static ArrayList<User> getUsersList() {
        return usersList;
    }
/*
     @desc: Setter method for usersList
     @params: ArrayList<User> usersList - List of users to set
     @return: void

 */
    public static void setUsersList(ArrayList<User> usersList) {
        CabOrganization.usersList = usersList;
    }
/*
     @desc: Default constructor for CabOrganization
     @params : no params
     @returns : no return
 */
    public CabOrganization() {
    }
/*
     @desc: Adds a new user to the organization
     @params: User user - User to be added
     @return: void

 */
    public void addNewUser(User user){
        usersList.add(user);
    }
/*
     @desc: Finds a user by their user ID
     @params: String userId - User ID to search for
     @return: User - Found user or null if not found

 */
    public User findUserByUserId(String userId){
        return usersList.stream().filter(user -> user.getUserId().equals(userId)).findFirst().orElse(null);
    }
/*
     @desc: Removes a user by their user ID
     @params: String userId - User ID to remove
     @return: void

 */
    public void removeUserByUserId(String userId){
        usersList.removeIf(user -> user.getUserId().equals(userId));
    }
}
