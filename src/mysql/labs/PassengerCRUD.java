package mysql.labs;

import javax.sql.DataSource;
import java.sql.*;

public class PassengerCRUD {
    private DataSource dataSource = DataSourcePool.getDataSource();

    public int createPassenger(Passenger passenger) {
        try (Connection connection = this.dataSource.getConnection()) {
            String sql = "INSERT INTO passengers " +
                    "(first_name, last_name, date_of_birth, nationality) " +
                    "VALUES (?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, passenger.getFirstName());
                preparedStatement.setString(2, passenger.getLastName());
                preparedStatement.setDate(3, Date.valueOf(passenger.getDateOfBirth()));
                preparedStatement.setString(4, passenger.getNationality());

                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public Passenger queryPassenger(int passenger_id) {
        Passenger passengerObj = new Passenger();
        try (Connection connection = this.dataSource.getConnection()) {
            String sql = "SELECT * FROM passengers WHERE passengers_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, passenger_id);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    passengerObj.setPassengerId(passenger_id);
                    passengerObj.setFirstName(resultSet.getString("first_name"));
                    passengerObj.setLastName(resultSet.getString("last_name"));
                    passengerObj.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
                    passengerObj.setNationality(resultSet.getString("nationality"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return passengerObj;
    }
    public int updatePassenger(int passengerId, Passenger passenger) {
        try (Connection connection = this.dataSource.getConnection()) {
            String sql = "UPDATE passengers " +
                    "SET first_name = ?, last_name = ?, date_of_birth = ?, nationality = ?" +
                    "WHERE passengers_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, passenger.getFirstName());
                preparedStatement.setString(2, passenger.getLastName());
                preparedStatement.setDate(3, Date.valueOf(passenger.getDateOfBirth()));
                preparedStatement.setString(4, passenger.getNationality());
                preparedStatement.setInt(5, passengerId);

                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int deletePassenger(int passengerId) {
        try (Connection connection = this.dataSource.getConnection()) {
            String sql = "DELETE FROM passengers WHERE passengers_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, passengerId);
                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


}
