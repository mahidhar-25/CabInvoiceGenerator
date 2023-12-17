
package com.bridgelaz.cabinvoicegenerator;

import com.bridggelabz.cabinvoicegenerator.InvoiceGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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


}
