import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {

    private PlaneType planeType;
    private Flight flight;
    private Passenger passenger;
    private Plane plane;
    private ArrayList<Passenger> passengers;

    @Before
    public void before(){
        this.passengers = new ArrayList<>();
        this.passenger = new Passenger("John", 2);
        this.plane = new Plane(PlaneType.AIRBUS320);
        this.flight = new Flight(plane, "FR1018", "EDI", "BUD", "17:10");


    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(2, flight.getPassengers());
    }

    @Test
    public void availableSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(318, flight.emptySeats(PlaneType.AIRBUS320));
    }

    @Test
    public void canBookPassengerWhenEmpty(){
        Plane smallPlane = new Plane(PlaneType.AIRBUSSML);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        System.out.println(flight.getPassengers());
        assertTrue(flight.bookPassenger(PlaneType.AIRBUSSML));
    }

    @Test
    public void canBookPassengerWhenFull(){
        Plane smallPlane = new Plane(PlaneType.AIRBUSSML);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertFalse(flight.bookPassenger(PlaneType.AIRBUSSML));
    }



}
