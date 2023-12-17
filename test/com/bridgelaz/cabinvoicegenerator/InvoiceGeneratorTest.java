
package com.bridgelaz.cabinvoicegenerator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/*
 * Test class for InvoiceGenerator that includes various test cases.
 */

public class InvoiceGeneratorTest {

    private InvoiceGenerator invoiceGenerator;

    /*
     * Setup method to initialize the InvoiceGenerator before each test case.
     */
    @Before
    public void setup(){
        invoiceGenerator = new InvoiceGenerator(10 , 1 , 5);
    }

    /*
     * Test case for calculating fare based on distance and time.
     */
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){

        double distance = 2;
        int time = 5;
        double fair = invoiceGenerator.calculateFare(distance , time);
        assertEquals(25 , fair , 0.0001);
    }

    /*
     * Test case for calculating minimum fare when distance and time are less.
     */
    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare(){
        double distance = 0.2;
        int time = 1;
        double fair = invoiceGenerator.calculateFare(distance , time);
        assertEquals(5 , fair , 0.0);
    }

    /*
     * Test case for calculating total fare for multiple rides.
     */
    @Test
    public  void givenMultipleRides_ShouldReturnTotalFare(){
        ArrayList<Ride> rides = new ArrayList<>(Arrays.asList(
                new Ride(2.0, 5),
                new Ride(0.1, 1),
                new Ride(10, 3)
        ));
        double totalFare = invoiceGenerator.calculateFare(rides);
        assertEquals(133 , totalFare , 0.0);
    }

    /*
     * Test case for getting invoice summary for multiple rides.
     */
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary(){
        ArrayList<Ride> rides = new ArrayList<>(Arrays.asList(
                new Ride(2.0, 5),
                new Ride(0.1, 1),
                new Ride(10, 3)
        ));
        InvoiceSummary invoiceSummary = invoiceGenerator.getInvoiceSummary(rides);
        InvoiceSummary expectedInvoice = new InvoiceSummary(3 , 133);
        assertTrue(expectedInvoice.equals(invoiceSummary));
    }

    /*
     * Test case for getting invoice summary for a specific user.
     */
    @Test
    public void givenUserId_ShouldReturnInvoiceSummary(){
        ArrayList<Ride> rides = new ArrayList<>(Arrays.asList(
                new Ride(2.0, 5),
                new Ride(0.1, 1),
                new Ride(10, 3),
                new Ride(2.0, 4),
                new Ride(0.3, 2),
                new Ride(6, 3),
                new Ride(2.5, 5),
                new Ride(1.1, 2),
                new Ride(9, 3)
        ));
        ArrayList<User> userArrayList = new ArrayList<>(Arrays.asList(
                new User("user1" , new ArrayList<>(rides.subList(0, 3))),
                new User("user2" , new ArrayList<>(rides.subList(1, 4))),
                new User("user3" , new ArrayList<>(rides.subList(2, 6))),
                new User("user4" , new ArrayList<>(rides.subList(3, 7)))
        ));
        CabOrganization.setUsersList(userArrayList);
        String userId = "user1";
        InvoiceSummary invoiceSummary = invoiceGenerator.getInvoiceSummary(userId);
        InvoiceSummary expectedInvoice = new InvoiceSummary(3 , 133);
        assertTrue(expectedInvoice.equals(invoiceSummary));
    }
}
