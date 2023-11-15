package mysql.labs;

import java.sql.Timestamp;

public class Flight {
    private int flightId;
    private int planeId;
    private int departureLocationId;
    private int arrivalLocationId;
    private Timestamp departureTime;
    private Timestamp arrivalTime;
    private int airlineId;
    private int pilotId;

    public Flight() {
    }

    public Flight(int planeId, int departureLocationId, int arrivalLocationId, Timestamp departureTime, Timestamp arrivalTime, int airlineId, int pilotId) {
        this.planeId = planeId;
        this.departureLocationId = departureLocationId;
        this.arrivalLocationId = arrivalLocationId;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.airlineId = airlineId;
        this.pilotId = pilotId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public int getDepartureLocationId() {
        return departureLocationId;
    }

    public void setDepartureLocationId(int departureLocationId) {
        this.departureLocationId = departureLocationId;
    }

    public int getArrivalLocationId() {
        return arrivalLocationId;
    }

    public void setArrivalLocationId(int arrivalLocationId) {
        this.arrivalLocationId = arrivalLocationId;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public int getPilotId() {
        return pilotId;
    }

    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", planeId=" + planeId +
                ", departureLocationId=" + departureLocationId +
                ", arrivalLocationId=" + arrivalLocationId +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", airline_id=" + airlineId +
                ", pilot_id=" + pilotId +
                '}';
    }
}
