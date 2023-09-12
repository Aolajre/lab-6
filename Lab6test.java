package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class Lab6test {

    @Test
    public void testFirstClassReservation() {
        // Arrange: Create an instance of the lab6 class
        Lab6test flightReservation = new Lab6test();

        // Act: Make a first-class reservation
        // For example, call a method to reserve a first-class seat
        // Ensure you simulate the scenario where there are available first-class seats
        boolean isReserved = flightReservation.reserveFirstClass();

        // Assert: Verify the expected result
        assertTrue(isReserved); // Check if the reservation was successful
        // You can also check the state of the seats array to ensure it's updated correctly
    }

    @Test
    public void testEconomyClassReservation() {
        // Arrange: Create an instance of the lab6 class
        Lab6test flightReservation = new Lab6test();

        // Act: Make an economy class reservation
        // For example, call a method to reserve an economy class seat
        // Ensure you simulate the scenario where there are available economy class seats
        boolean isReserved = flightReservation.reserveEconomyClass();

        // Assert: Verify the expected result
        assertTrue(isReserved); // Check if the reservation was successful
        // You can also check the state of the seats array to ensure it's updated correctly
    }

    @Test
    public void testFirstClassFull() {
        // Arrange: Create an instance of the lab6 class
        Lab6test flightReservation = new Lab6test();

        // Act: Make multiple first-class reservations until it's full (should be 5)
        for (int i = 0; i < 5; i++) {
            flightReservation.reserveFirstClass();
        }

        // Attempt to make another first-class reservation
        boolean isReserved = flightReservation.reserveFirstClass();

        // Assert: Verify the expected result (should be false, as first class is full)
        assertFalse(isReserved);
        // You can also check the state of the seats array to ensure it's updated correctly
    }

    @Test
    public void testEconomyClassFull() {
        // Arrange: Create an instance of the lab6 class
        Lab6test flightReservation = new Lab6test();

        // Act: Make multiple economy class reservations until it's full (should be 10)
        for (int i = 0; i < 10; i++) {
            flightReservation.reserveEconomyClass();
        }

        // Attempt to make another economy class reservation
        boolean isReserved = flightReservation.reserveEconomyClass();

        // Assert: Verify the expected result (should be false, as economy class is full)
        assertFalse(isReserved);
        // You can also check the state of the seats array to ensure it's updated correctly
    }
}
