/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */

package mysql.labs;

import java.sql.Timestamp;
import java.time.LocalDate;


public class Exercise_04 {

    public static void main(String[] args) {
        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);
         */
        Timestamp departureTime = new Timestamp(System.currentTimeMillis());
        Timestamp arrivalTime = new Timestamp(System.currentTimeMillis() + 7200000);

        Flight flight1 = new Flight(103, 3, 2, departureTime, arrivalTime, 2, 1);
        FlightCRUD flight = new FlightCRUD(DataSourcePool.getDataSource());

        flight.createFlight(flight1);

        System.out.println(flight.queryFlight(3).toString());

        int deletedRows = flight.deleteFlight(11);
        System.out.println("Deleted rows: " + deletedRows);

        int updatedRows = flight.updateFlight(8, flight1);
        System.out.println("Updated rows: " + updatedRows);

        LocalDate dateOfBirth = LocalDate.of(1967, 3, 26);
        Passenger passenger = new Passenger("Jimbo", "Jones", "Canadian", dateOfBirth);
        PassengerCRUD passengerCRUD = new PassengerCRUD();

        passengerCRUD.createPassenger(passenger);

        System.out.println(passengerCRUD.queryPassenger(2).toString());

        System.out.println("Deleted rows: " + passengerCRUD.deletePassenger(1));

        System.out.println("Updated rows: " + passengerCRUD.updatePassenger(4, passenger));

    }

}
