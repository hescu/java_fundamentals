package labs_examples.exception_handling.labs;

import java.util.ArrayList;
import java.util.List;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Exercise_07 {
    public static void main(String[] args) {
        int passengers = 179;

        try {
            addPassengerToFlight("Hendrik", passengers);
        } catch (FlightFullyBookedException exc) {
            System.out.println(exc.toString());
        }
    }

    public static void addPassengerToFlight(String passenger, int passengers) throws FlightFullyBookedException{
        if (passengers < 178) {
            // add passengers to some list or something
        } else {
            throw new FlightFullyBookedException();
        }
    }
}

class FlightFullyBookedException extends Exception {
    @Override
    public String toString() {
        return "FlightFullyBookedException{ This flight is fully booked. }";
    }
}

