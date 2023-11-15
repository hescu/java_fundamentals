package mysql.labs;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightCRUD {
    private DataSource dataSource;

    public FlightCRUD(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createFlight(Flight flight) {
        try (Connection connection = this.dataSource.getConnection()) {
            String sql = "INSERT INTO flights " +
                    "(plane_id, departure_location_id, arrival_location_id, " +
                    "departure_time, arrival_time, airline_id, pilot_id) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, flight.getPlaneId());
                preparedStatement.setInt(2, flight.getDepartureLocationId());
                preparedStatement.setInt(3, flight.getArrivalLocationId());
                preparedStatement.setTimestamp(4, flight.getDepartureTime());
                preparedStatement.setTimestamp(5, flight.getArrivalTime());
                preparedStatement.setInt(6, flight.getAirlineId());
                preparedStatement.setInt(7, flight.getPilotId());

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Flight queryFlight(int flightId) {
        Flight flightObj = new Flight();
        try (Connection connection = this.dataSource.getConnection()) {
            String sql = "SELECT * FROM flights WHERE flight_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, flightId);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    flightObj.setFlightId(resultSet.getInt("flight_id"));
                    flightObj.setPlaneId(resultSet.getInt("plane_id"));
                    flightObj.setDepartureLocationId(resultSet.getInt("departure_location_id"));
                    flightObj.setArrivalLocationId(resultSet.getInt("arrival_location_id"));
                    flightObj.setDepartureTime(resultSet.getTimestamp("departure_time"));
                    flightObj.setArrivalTime(resultSet.getTimestamp("arrival_time"));
                    flightObj.setAirlineId(resultSet.getInt("airline_id"));
                    flightObj.setPilotId(resultSet.getInt("pilot_id"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flightObj;
    }
    public int updateFlight(int flightId, Flight flight) {
        try (Connection connection = this.dataSource.getConnection()) {
            String sql = "UPDATE flights " +
                    "SET plane_id = ?, departure_location_id = ?, arrival_location_id = ?, " +
                    "departure_time = ?, arrival_time = ?, airline_id = ?, pilot_id = ? " +
                    "WHERE flight_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, flight.getPlaneId());
                preparedStatement.setInt(2, flight.getDepartureLocationId());
                preparedStatement.setInt(3, flight.getArrivalLocationId());
                preparedStatement.setTimestamp(4, flight.getDepartureTime());
                preparedStatement.setTimestamp(5, flight.getArrivalTime());
                preparedStatement.setInt(6, flight.getAirlineId());
                preparedStatement.setInt(7, flight.getPilotId());
                preparedStatement.setInt(8, flightId);

                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int deleteFlight(int flightNumber) {
        try (Connection connection = this.dataSource.getConnection()) {
            String sql = "DELETE FROM flights WHERE flight_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, flightNumber);
                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
