import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {


    Plane plane1;
    Plane plane2;
    Flight flight1;
    Flight flight2;

    @Before
    public void before () {
        plane1 = new Plane(PlaneType.BOEING_737,AirlineType.EASYJET);
        plane2 = new Plane(PlaneType.BIPLANE,AirlineType.RYANAIR);
        flight1 = new Flight(plane1, 001, Destination.BERLIN);
        flight2 = new Flight(plane2,002,Destination.LONDON);
    }

    @Test
    public void canGetProperties () {
        assertEquals(plane1, flight1.getPlane());
        assertEquals(001, flight1.getFlightNo());
        assertEquals(Destination.BERLIN,flight1.getDestination());
    }
}
