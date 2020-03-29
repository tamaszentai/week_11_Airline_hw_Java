import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
       this.passengers.add(passenger);
    }

    public int emptySeats(PlaneType planeType) {
       return planeType.getCapacity() - getPassengers();
    }

    public boolean bookPassenger(PlaneType planeType) {
        return planeType.getCapacity() >= getPassengers();

    }
}
